package rmi.exercie2;

import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class RMIClient {
    public static void test() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1000);
            Calculator calculator = (Calculator)registry.lookup("Calculator");
            var result = calculator.doSquare(10);
            System.out.println("Result: " + result);
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
