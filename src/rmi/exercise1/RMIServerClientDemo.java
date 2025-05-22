package rmi.exercise1;

public class RMIServerClientDemo {
    public static void simulate(){
        RMIServer.show();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        RMIClient.show();
    }
}
