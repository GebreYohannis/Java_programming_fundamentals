package network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo {
    public static void show() {

        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 3000;

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress ipAddress = InetAddress.getByName(SERVER_IP);
            String message = "Client message goes here...";
            byte[] messageBuffer = message.getBytes();

            DatagramPacket packetToSend = new DatagramPacket(
                    messageBuffer,
                    messageBuffer.length,
                    ipAddress,
                    SERVER_PORT
            );
            socket.send(packetToSend);

            // Get response
            byte[] receiveBuffer = new byte[1024];
            var responsePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(responsePacket);

            String responseMessage = new String(responsePacket.getData(), 0, receiveBuffer.length);
            System.out.println("Server replied: " + responseMessage);

        } catch (IOException ex) {

        }
    }
}
