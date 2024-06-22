package com.alurachallenge.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitud {
    public JsonObject buscaMonedas(String busqueda) throws IOException, InterruptedException {
        URI direccion = URI.create (
                "https://v6.exchangerate-api.com/v6/072ba534b49aaadbf259626d/latest/" + busqueda + "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        return JsonParser.parseString(responseBody).getAsJsonObject();
    }
}