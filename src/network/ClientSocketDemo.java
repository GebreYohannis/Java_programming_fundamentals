package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocketDemo {
    public static void show(){
        try {
            Socket socket = new Socket("localhost",5000);

            var writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
            writer.println("Client said: Hello Server!!");

            var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var line = reader.readLine();
            System.out.println(line);
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
