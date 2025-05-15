package executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send(String message){
        System.out.println("Sending ...");

        LongTask.simulate();

        System.out.println(message);
        System.out.println("Mail was sent.");
    }

    public CompletableFuture<Void> sendAsync(String message){
        return CompletableFuture.runAsync(()->send(message));
    }
}
