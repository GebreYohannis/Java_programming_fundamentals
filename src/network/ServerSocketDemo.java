package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void show(){
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is listening on port 5000");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected...");

            var writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
            writer.println("Server said: Hello  Client!!!");

            var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var line = reader.readLine();
            System.out.println("Client Message: " + line);

            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
