package executors;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class BestPriceFinderDemo {
    public static void show() {
        var startTime = LocalDateTime.now();
        var service = new FlightService();
//        service.getQuote("site1")
//                .thenAccept(System.out::println);

        var futures = service.getQuotes()
                .map(future->future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(()->{
                    var endTime = LocalDateTime.now();
                    var duration = Duration.between(startTime,endTime);
                    System.out.println("Retrieve all quote in " + duration.toMillis() + " msec.");
                });
    }
}
