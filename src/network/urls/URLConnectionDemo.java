package network.urls;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class URLConnectionDemo {
    public static void show() {
//        sendPostRequest();
//        sendDeleteRequest();
        sendPutRequest();
//        getData();
    }

    private static void getData() {
        try {
            var url = new URL("https://dummyjson.com/users");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            var requestMethod = connection.getRequestMethod();
            System.out.println("Method: " + requestMethod);

            var responseCode = connection.getResponseCode();
            System.out.println("ResponseCode: " + responseCode);

            var message = connection.getResponseMessage();
            System.out.println("Message: " + message);

            var inStream = connection.getInputStream();
            var reader = new BufferedReader(new InputStreamReader(inStream));
            var userData = fetchData(reader);

            userData.stream()
                    .filter(user -> user.getFirstName()
                            .toLowerCase()
                            .startsWith("a")
                    )
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<User> fetchData(BufferedReader reader) {
        var data = reader.lines().collect(Collectors.joining());

        var userData = Stream.of(data.substring(
                        data.indexOf("{\"users\":[") + 8,
                        data.indexOf("]") + 1
                ).split("\\},\\{"))
                .map(d -> d.replaceAll("[{}\"]", ""))
                .map(userString -> {
                    String[] attributes = userString.split(",");
                    int id = 0;
                    String firstName = "", lastName = "", email = "";
                    for (String attribute : attributes) {
                        String[] pair = attribute.split(":");
                        if (pair.length == 2) {
                            String key = pair[0].trim();
                            String value = pair[1].trim();
                            switch (key) {
                                case "id" -> id = Integer.valueOf(value);
                                case "firstName" -> firstName = value;
                                case "lastName" -> lastName = value;
                                case "email" -> email = value;
                            }
                        }
                    }
                    return new User(id, firstName, lastName, email);
                })
                .collect(Collectors.toList());
        return userData;
    }

    public static void sendPostRequest() {
        try {
            var url = new URL("https://dummyjson.com/users/add");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String jsonInput = """
                    {
                        "firstName":"Demis",
                        "lastName":"Getachew",
                        "email":"demis@domain.com"
                    }
                    """;
            try (var outStream = new BufferedOutputStream(connection.getOutputStream())) {
                outStream.write(jsonInput.getBytes());
                outStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            var code = connection.getResponseCode();
            System.out.println("ResponseCode: " + code);

            try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
                reader.lines().forEach(System.out::println);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void sendDeleteRequest(){
        try {
            var url = new URL("https://dummyjson.com/users/1");
            var connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("DELETE");
            var code = connection.getResponseCode();
            System.out.println("ResponseCode: " + code);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendPutRequest(){
        try {
            var url = new URL("https://dummyjson.com/users/1");
            var connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("PUT");
            connection.setDoOutput(true);
            String jsonInput = """
                    {
                        "id":1,
                        "firstName":"Demis",
                        "lastName":"Getachew"
                    }
                    """;
            try(BufferedOutputStream outputStream = new BufferedOutputStream(connection.getOutputStream())){
                outputStream.write(jsonInput.getBytes());
                outputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            var code = connection.getResponseCode();
            System.out.println("ResponseCode: " + code);

            try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
                 reader.lines().forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
