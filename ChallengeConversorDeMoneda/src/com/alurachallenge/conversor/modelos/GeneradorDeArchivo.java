package com.alurachallenge.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class GeneradorDeArchivo {
    public void guardar (List<String> historialConversiones) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter escritura = new FileWriter("Historial.json")) {
            escritura.write(gson.toJson(historialConversiones));
            escritura.close();
        }

        try (FileWriter escrituraDos = new FileWriter("HistorialConsultas.txt")){
            for (String registro : historialConversiones) {
                escrituraDos.write(registro + System.lineSeparator());
            }
            escrituraDos.close();
        }
    }

    public void guardarArchivos(Conversor conversor){
        try {
            guardar(conversor.obtenerHistorial());
            System.out.println("Su historial de consultas se ha guardado correctamente.");
        }catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
        }
    }
}