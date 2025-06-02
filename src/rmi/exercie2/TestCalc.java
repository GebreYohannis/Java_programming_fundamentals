package rmi.exercie2;

public class TestCalc {
    public static void test(){
        RMIServer.test();

        try {
            Thread.sleep(1000);// Wait for 1sec till the server started
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        RMIClient.test();
    }
}
