package network.exercise;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSocket {
    public static void test(){
        try {
            var socket = new Socket("localhost",4000);

            var outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(new User("Abebe",24));

            var inputStream = new ObjectInputStream(socket.getInputStream());
            User user = (User)inputStream.readObject();
            System.out.println("Data Sent from server: " + user);

            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
