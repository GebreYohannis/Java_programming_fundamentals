package rmi.exercie2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    double doSquare(double number) throws RemoteException;
}
