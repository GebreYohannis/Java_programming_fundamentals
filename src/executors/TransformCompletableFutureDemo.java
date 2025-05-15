package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TransformCompletableFutureDemo {
    public static void show(){
        var future = CompletableFuture.supplyAsync(()->20);

        try {
            var result = future
//                .thenApply(celsius->(celsius * 1.8) + 32)
                .thenApply(TransformCompletableFutureDemo::toFahrenheit)
                .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
//        completeTask();
//        compose();

//        combine();
//        waitForAllOfToComplete();

//        waitForAnyOfToComplete();
        handleTimeout();
    }

    private static double toFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    private static void completeTask(){
        var future = CompletableFuture.supplyAsync(()->20);
        future
            .thenApply(TransformCompletableFutureDemo::toFahrenheit)
            .thenAccept(System.out::println);
    }
    private static void compose(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"Email");
        future
            .thenCompose(email-> CompletableFuture.supplyAsync(()->"PlayList"))
            .thenAccept(System.out::println);

        // Instead of doing the above code we can do the following
        getUserEmailAsync()
                .thenCompose(email->CompletableFuture.supplyAsync(()->"PlayList"))
                .thenAccept(System.out::println);

        // we can even make better the above code too

        getUserEmailAsync()
//                .thenCompose(email->getPlaylistAsync(email)) // or
                .thenCompose(TransformCompletableFutureDemo::getPlaylistAsync)
                .thenAccept(System.out::println);
    }

    private static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(()->"Email");
    }

    private static CompletableFuture<String> getPlaylistAsync(String email){
        return CompletableFuture.supplyAsync(()->"Playlist");
    }
    private static void combine(){
        // Combining two CompletableFuture or Async object
        var first = CompletableFuture
                .supplyAsync(()->"30BIRR")
                .thenApply(str->{
                    var price = str.replace("BIRR","");
                    return Integer.parseInt(price);
                });
        var second = CompletableFuture.supplyAsync(()->0.9);
        var newCompletableFuture = first.thenCombine(second,(price,exchangeRate)-> price * exchangeRate);
        newCompletableFuture.thenAccept(System.out::println);
    }

    private static void waitForAllOfToComplete(){
        var first = CompletableFuture.supplyAsync(()->1);
        var second = CompletableFuture.supplyAsync(()->2);
        var third = CompletableFuture.supplyAsync(()->3);
        var newCompletableFuture = CompletableFuture.allOf(first, second,third);
        newCompletableFuture.thenRun(()->{
            try {
                var firstResult = first.get(); // this time the get() method run asynchronously
                System.out.println(firstResult);

                var secondResult = second.get();
                System.out.println(secondResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println("All task completed successfully!!");
        });
    }

    private static void waitForAnyOfToComplete(){

        var first = CompletableFuture.supplyAsync(()->{
            LongTask.simulate();
            System.out.println("First");
            return 30;
        });


        var second = CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Second");
            return 10;
        });

        var newCompletableFuture = CompletableFuture.anyOf(first,second);
        newCompletableFuture.thenRun(()->{
            System.out.println("One of the task has completed successfully!!");
        });

        newCompletableFuture.thenAccept(System.out::println);
    }

    private static void handleTimeout(){
        var future = CompletableFuture.supplyAsync(()->{
            LongTask.simulate();
            return 1;
        });

//        try {
//            var result = future
//                .orTimeout(1, TimeUnit.SECONDS)
//                .get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        try {
            var result = future
                .completeOnTimeout(1,1,TimeUnit.SECONDS)
                .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
