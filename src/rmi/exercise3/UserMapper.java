package rmi.exercise3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserMapper extends UnicastRemoteObject implements UserRepository {

    protected UserMapper() throws RemoteException {
    }

    @Override
    public void registerUser(User user) throws RemoteException {
        // Register user to db
        System.out.println(user);
    }
}
