package rmi.exercise3;

public class TestUserRepositoryServer {
    public static void test(){
        RMIServer.test();

        try {
            Thread.sleep(1000);// Wait for 1sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        RMIClient.test();
    }
}
