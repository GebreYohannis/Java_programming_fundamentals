package network;

public class ConnectionDemo {
    public static void test(){
        new Thread(() -> {
            ServerSocketDemo.show();
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ClientSocketDemo.show();
    }
}
