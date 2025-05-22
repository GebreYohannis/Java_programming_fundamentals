package rmi.exercise1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void show(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",3000);
            GreetingService service = (GreetingService) registry.lookup("GreetingService");
            var response = service.greet("Demis");

            System.out.println("Server response: " + response);
            System.exit(0);
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
