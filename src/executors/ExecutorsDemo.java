package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public  static  void show() {
        System.out.println("Running...");
    }

    private static void callable() {
        var executors = Executors.newFixedThreadPool(2);

        try {
            var future = executors.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            System.out.println("Do more work");

            try {
                var result = future.get();
                System.out.println(result);
                System.out.println("Done!");
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } finally {
            executors.shutdown();
        }
    }

    private static void runnable() {
        var executor = Executors.newFixedThreadPool(2);
        try {
            for (int i = 0; i < 10; ++i)
                executor.submit(() -> {
                    System.out.println(Thread.currentThread().getName());
                });
        } finally {
            executor.shutdown();
        }
    }
}
