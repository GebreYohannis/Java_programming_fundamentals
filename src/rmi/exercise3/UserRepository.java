package rmi.exercise3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserRepository extends Remote {
    void registerUser(User user) throws RemoteException;
}
