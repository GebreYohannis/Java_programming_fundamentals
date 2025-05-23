package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Greeting extends UnicastRemoteObject implements HelloService {
    protected Greeting() throws RemoteException {
        super();// Required for remote object creation
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "! Welcome to RMI world!";
    }
}
