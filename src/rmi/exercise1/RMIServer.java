package rmi.exercise1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void show(){
        try {
            GreetingServiceProvider service = new GreetingServiceProvider();
            Registry registry = LocateRegistry.createRegistry(3000);
            registry.rebind("GreetingService",service);

            System.out.println("RMI server is running... on port 3000.");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

    }
}
