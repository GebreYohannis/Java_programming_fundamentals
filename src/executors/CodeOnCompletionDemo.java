package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CodeOnCompletionDemo {
    public static void show(){
        var future = CompletableFuture.supplyAsync(()->1);
        future.thenRun(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
        future.thenRunAsync(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        future.thenAccept(result->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        future.thenAcceptAsync(result->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
    }
}
