package com.alurachallenge.conversor.principal;

import com.alurachallenge.conversor.modelos.Conversor;
import com.alurachallenge.conversor.modelos.GeneradorDeArchivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        String menu = """
                \n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                Bienvenido/a al Conversor de Monedas 
                \nSeleccione una de las siguientes opciones:
                \n1)-Peso Argentino =>> Dolar Estadounidense
                2)-Dolar Estadounidense =>> Peso Colombiano
                3)-Peso Chileño =>> Real Brasileño
                4)-Boliviano Boliviano=>> Dolar Estadounidense
                5)-Sol Peruano =>> Guaraní Paraguayo
                6)-Peso Uruguayo =>> Dolar Estadounidense
                7)-Otras opciones de divisas
                8)-Ver el "Historial de conversiones"
                9)-Imprimir el "Historial de conversiones"
                10) Salir.
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """;

        while (!salir) {
            System.out.println(menu);
            int option = entrada.nextInt();
            entrada.nextLine();

            switch (option) {
                case 1 -> conversor.cambiarMoneda(entrada, "ARS", "USD");
                case 2 -> conversor.cambiarMoneda(entrada, "USD", "COP");
                case 3 -> conversor.cambiarMoneda(entrada, "CLP", "BRL");
                case 4 -> conversor.cambiarMoneda(entrada, "BOB", "USD");
                case 5 -> conversor.cambiarMoneda(entrada, "PEN", "PYG");
                case 6 -> conversor.cambiarMoneda(entrada, "UYU", "USD");
                case 7 -> conversor.conversionUsuario(entrada);
                case 8 -> conversor.mostrarHistorial();
                case 9 ->generadorDeArchivo.guardarArchivos(conversor);
                case 10 -> salir = true;

                default -> System.out.println("""
                        La opción seleccionada no existe. 
                        Por favor, elija una opción válida.
                        """);
            }
        }
        System.out.println("""
                Gracias por usar nuestro servicios.
                Saliendo del programa...
                """);
        entrada.close();
    }
}
