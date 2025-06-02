package rmi.exercie2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void test(){
        try {
            var calculator = new SimpleCalculator();
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("Calculator",calculator);

            System.out.println("RMI server is running on port 1000");
        }catch (RemoteException ex){
            throw new RuntimeException(ex);
        }
    }
}
