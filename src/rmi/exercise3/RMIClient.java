package rmi.exercise3;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void test(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1000);
            UserRepository repository = (UserRepository)registry.lookup("UserRepository");
            repository.registerUser(new User("Demis",22));

            System.out.println("Done!");
            System.exit(0);
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
