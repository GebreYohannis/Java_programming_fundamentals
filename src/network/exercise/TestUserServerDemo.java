package network.exercise;

public class TestUserServerDemo {
    public static void test(){
        new Thread(ServerSocketDemo::test).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ClientSocket.test();
    }
}
