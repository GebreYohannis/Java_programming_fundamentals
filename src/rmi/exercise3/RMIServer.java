package rmi.exercise3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void test() {
        try {
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("UserRepository", new UserMapper());
            System.out.println("Server is listening on port 1000...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
