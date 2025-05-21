package rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServerDemo {
    public static void show(){
        try {
            Greeting greet = new Greeting();
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("HelloService", greet);
            System.out.println("RMI server is running...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
