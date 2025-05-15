package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

class User implements Serializable {
    private final UUID userId;
    private String username;

    public User(String username) {
        this.username = username;
        userId = UUID.randomUUID();
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "{ userId: " + userId + ", username: " + username + " }";
    }
}

public class InputStreamReaderDemo {
    public static void show() {

        try (var objectWriter = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            List<User> users = List.of(
                    new User("@demisgech"),
                    new User("@dereje"),
                    new User("@alex"),
                    new User("@kebede")
            );
            objectWriter.writeObject(users);

            System.out.println("Successfully written!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (var objectReader = new ObjectInputStream(new FileInputStream("person.txt"))) {
            var users = (List<User>) objectReader.readObject();

            for (var user : users)
                System.out.println(user);

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
//        try(InputStreamReader reader = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//            int letters = reader.read();
//            while (reader.ready()){
//                System.out.println((char) letters);
//                letters = reader.read();
//            }
//
//        }catch (IOException ex) {
//            ex.printStackTrace();
//        }

    }
}
