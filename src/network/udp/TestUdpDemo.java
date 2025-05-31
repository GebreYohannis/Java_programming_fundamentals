package network.udp;

public class TestUdpDemo {
    public static void test() {
        new Thread(()->{
            UdpServerDemo.show();
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        UdpClientDemo.show();
    }
}
