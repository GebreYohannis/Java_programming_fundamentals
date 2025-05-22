package rmi.exercise1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GreetingServiceProvider extends UnicastRemoteObject implements GreetingService {

    protected GreetingServiceProvider() throws RemoteException {
        super();
    }

    @Override
    public String greet(String name) throws RemoteException {
        return "Hello " + name + "! Welcome to RMI world.";
    }
}
