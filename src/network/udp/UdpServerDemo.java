package network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServerDemo {
    public static void show() {

            final int PORT = 3000;

            try (DatagramSocket socket = new DatagramSocket(PORT)) {
                System.out.println("UDP server is running on port " + PORT);
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(packet);

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received from client: " + message);

                String response = "Hello from server! You said: " + message;
                byte[] responseBuffer = response.getBytes();

                var packetToBeSent = new DatagramPacket(
                        responseBuffer,
                        responseBuffer.length,
                        packet.getAddress(),
                        packet.getPort()
                );
                socket.send(packetToBeSent);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
    }
}
