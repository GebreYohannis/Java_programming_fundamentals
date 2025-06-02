package rmi.exercie2;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class SimpleCalculator extends UnicastRemoteObject implements Calculator {
    protected SimpleCalculator() throws RemoteException {
        super();
    }

    @Override
    public double doSquare(double number) throws RemoteException {
        return number * number;
    }
}
