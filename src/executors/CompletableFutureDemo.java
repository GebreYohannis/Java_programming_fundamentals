package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        Runnable runnable = () -> System.out.println("running...");
        var future = CompletableFuture.runAsync(runnable);
        System.out.println(future);

        Supplier<Integer> supplier = () -> 1;

        var futureSupplier = CompletableFuture.supplyAsync(supplier);
        try {
            var result = futureSupplier.get();
            System.out.println(result);
            System.out.println("Done");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
