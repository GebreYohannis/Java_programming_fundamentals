package network.exercise;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void test(){
        try {
            var serverSocket = new ServerSocket(4000);
            Socket socket = serverSocket.accept(); // Accept client

            var outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(new User("Demis",22));

            var inputStream = new ObjectInputStream(socket.getInputStream());
            User user = (User)inputStream.readObject();

            System.out.println("Data Sent from Client: " + user);

            socket.close();
            serverSocket.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
