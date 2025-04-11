package concurrency;

import java.util.ArrayList;
import java.util.List;

public class AtomicOperationDemo {
    public static void show() {

        raceCondition();
    }
    public static void raceCondition() {
        List<Thread> threads = new ArrayList<>();
        var status = new AtomicOperationStatus();

        for (var i = 1; i <= 10; i++) {
            var thread = new Thread(new AtomicOperationTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread: threads) {
            try{
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Operation: " + status.getTotalOperation());
    }

}
