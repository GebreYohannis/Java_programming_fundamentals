package network.urls;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FetchJsonData {

    public static void show() {
        try {

            var url = new URL("https://dummyjson.com/users");
            try (var reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String jsonString = reader.lines().collect(Collectors.joining()); // Read entire response

                // Extract & parse users
                List<User> users = parseUsers(jsonString);
                users.forEach(System.out::println); // Print parsed users
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> parseUsers(String jsonString) {
        // Ensure response has expected structure
        int startIdx = jsonString.indexOf("{\"users\":[") + 8;
        int endIdx = jsonString.lastIndexOf("]") + 1;

        if (startIdx == 7 || endIdx == -1) {
            System.out.println("Invalid JSON format!");
            return List.of();
        }

        // Extract only the user array portion
        String usersArray = jsonString.substring(startIdx, endIdx);

        return Stream.of(usersArray.split("\\},\\{")) // Stream user objects
                .map(user -> user.replace("{", "")
                        .replace("}", "")
                        .replace("\"", "")) // Clean JSON formatting
                .map(FetchJsonData::mapUser) // Convert to User object
                .collect(Collectors.toList()); // Collect into a List<User>
    }

    private static User mapUser(String userString) {
        String[] attributes = userString.split(",");
        int id = 0;
        String firstName = "", lastName = "", email = "";

        for (String attribute : attributes) {
            String[] pair = attribute.split(":");
            if (pair.length == 2) {
                String key = pair[0].trim();
                String value = pair[1].trim();

                switch (key) {
                    case "id" -> id = Integer.parseInt(value);
                    case "firstName" -> firstName = value;
                    case "lastName" -> lastName = value;
                    case "email" -> email = value;
                }
            }
        }
        return new User(id, firstName, lastName, email);
    }
}