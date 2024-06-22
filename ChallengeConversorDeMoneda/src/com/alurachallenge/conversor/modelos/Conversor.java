package com.alurachallenge.conversor.modelos;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conversor {
    private static final List<String> historialConversiones = new ArrayList<>();
    private final Solicitud solicitudApi = new Solicitud();

    public void cambiarMoneda(Scanner entrada, String divisa, String divisaDos) {
        try {
            Monedas monedas = obtenerMonedas(divisa);
            double monto = solicitarMonto(entrada);

            Double tasaDeConversion = obtenerTasaConversion(monedas, divisaDos);
            if (tasaDeConversion != null) {
                realizarConversion(monto, divisa, divisaDos, tasaDeConversion);
            } else {
                System.out.println("No se encontró la divisa. \n");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("""
                    Ocurrió un error al comunicarse con la API.
                    Estamos trabajando para solucionarlo.""");
        }
    }

    public void conversionUsuario(Scanner entrada){
        try{
            System.out.println("Ingrese el tipo de divisa a convertir: ");
            String divisa = entrada.next().toUpperCase().replace(" ", " ");
            System.out.println("Ingrese el tipo de divisa a obtener: ");
            String divisaDos = entrada.next().toUpperCase().replace(" ", " ");
            cambiarMoneda(entrada, divisa, divisaDos);
        }catch (Exception e){
            System.out.println("No se encontró la divisa: " + e.getMessage());
        }
    }

    private Monedas obtenerMonedas(String divisas) throws IOException, InterruptedException {
        JsonObject jsonMonedas = solicitudApi.buscaMonedas(divisas);
        return new Monedas(jsonMonedas.get("base_code").getAsString(),
                jsonMonedas.get("conversion_rates").getAsJsonObject());
    }

    private double solicitarMonto (Scanner entrada) {
        System.out.print("Ingrese la cantidad de dinero que desea convertir: ");
        double monto = entrada.nextDouble();
        entrada.nextLine();
        return monto;
    }

    private Double obtenerTasaConversion (Monedas monedas, String divisaDos){
        return monedas.conversion_rates().get(divisaDos).getAsDouble();
    }

    private void realizarConversion (double monto, String divisa, String divisaDos, Double tasaDeConversion){
        double valorConvertido = monto * tasaDeConversion;
        String fechaHora = obtenerFechaHora();
        String registro = String.format("Fecha/Hora: %s | %.2f %s => %.2f %s", fechaHora,
                monto, divisa, valorConvertido, divisaDos);
        System.out.printf("El valor de %.2f %s en %s es: %.2f%n", monto, divisa,
                divisaDos, valorConvertido);
        historialConversiones.add(registro);
    }

    private String obtenerFechaHora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    public void mostrarHistorial() {
        if (historialConversiones.isEmpty()) {
            System.out.println("""
                    El historial esta vacío.
                    No se han realizado conversiones.
                    """);
        } else {
            System.out.println("Estas son las consultas realizadas: ");
            for (String registro : historialConversiones) {
                System.out.println(registro);
            }
        }
    }

    public List <String> obtenerHistorial(){
        return new ArrayList<>(historialConversiones);
    }
}
