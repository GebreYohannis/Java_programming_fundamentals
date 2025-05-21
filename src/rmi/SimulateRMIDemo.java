package rmi;

import rmi.client.RMIClientDemo;
import rmi.server.RMIServerDemo;

public class SimulateRMIDemo {
    public static void simulate(){
        RMIServerDemo.show();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        RMIClientDemo.show();
    }
}
