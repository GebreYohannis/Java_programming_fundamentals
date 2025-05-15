package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandleAsyncExceptionDemo {
    public static void show(){
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(()->{
            System.out.println("Doing something ...");
            throw new IllegalStateException();
        });

        try {
//            future.get();
            var result = future.exceptionally(e->1).get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
