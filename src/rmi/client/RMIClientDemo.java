package rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.server.HelloService;

public class RMIClientDemo {
    public static void show(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1000);
            HelloService service = (HelloService)registry.lookup("HelloService");
            System.out.println("Getting remote object...");
            var sayHello = service.sayHello("Demis");
            System.out.println("Server response: " + sayHello);
//            registry.unbind("HelloService");
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
