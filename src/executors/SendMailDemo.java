package executors;

public class SendMailDemo {
    public static void show() {
        var service = new MailService();
//        service.send("Hello Devs!");
        service.sendAsync("Hello Devs!");

        System.out.println("Hello world");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
