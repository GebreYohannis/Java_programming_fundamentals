package network.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientDemo {
    public static void show() {
//        sendGetRequest();
//        sendPostRequest();
//        sendPutRequest();
//        sendDeleteRequest();

        // Asynchronous request

//        sendAsyncGetRequest();
        sendMultipleAsyncGetRequest();
    }

    public static void sendAsyncGetRequest() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/posts"))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        responseFuture.thenAccept(response -> {
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        }).join();
    }

    public static void sendMultipleAsyncGetRequest() {
        var client = HttpClient.newHttpClient();

        HttpRequest userRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/users"))
                .GET()
                .build();
        CompletableFuture<HttpResponse<String>> userResponseFuture = client.sendAsync(userRequest, HttpResponse.BodyHandlers.ofString());

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/posts"))
                .GET()
                .build();
        CompletableFuture<HttpResponse<String>> postResponseFuture = client.sendAsync(postRequest, HttpResponse.BodyHandlers.ofString());

        CompletableFuture
                .allOf(userResponseFuture, postResponseFuture)
                .thenRun(() -> {
                    try {
                        System.out.println("Users request status code: " + userResponseFuture.get().statusCode());
                        System.out.println("Users request body: " + userResponseFuture.get().body());

                        System.out.println("Posts request status code: " + postResponseFuture.get().statusCode());
                        System.out.println("Posts request body: " + postResponseFuture.get().body());

                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }).join();

    }

    private static void sendDeleteRequest() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/users/1"))
                .DELETE()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendPutRequest() {
        HttpClient client = HttpClient.newHttpClient();
        String jsonInput = """
                {
                    "id":1,
                    "firstName":"Demis",
                    "lastName":"Getachew"
                }
                """;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/users/1"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(jsonInput))
                .build();
        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendPostRequest() {
        HttpClient client = HttpClient.newHttpClient();
        String jsonInput = """
                {
                    "firstName": "Demis",
                    "lastName":"Getachew",
                    "email":"demis@domain.com"
                }
                """;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/users/add"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonInput))
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendGetRequest() {
        var client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/users"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
