package concurrency;

import java.util.ArrayList;
import java.util.List;

public class ScanFileThreadDemo {
    public static void show() {
//        locks();
        synchronization();
    }

    private static void raceCondition() {
        var status = new ScanStatus();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            var thread = new Thread(new ScanFileTask(status));
            thread.start();
            threads.add(thread);
        }
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total bytes: " + status.getTotalBytes());
    }

    public static void confinementSimplestSolutionForConcurrencyIssue() {
        List<Thread> threads = new ArrayList<>();
        List<ScanFileTask> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            var status = new ScanStatus();
            var task = new ScanFileTask(status);

            var thread = new Thread(task);
            thread.start();

            tasks.add(task);
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalTask = tasks.stream()
                .map(task -> task.getStatus().getTotalBytes())
                .reduce(0, (a, b) -> a + b);
        System.out.println("Total Bytes: " + totalTask);
    }

    private static void locks() {
        var status = new ScanStatus();
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            var thread = new Thread(new ScanFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total bytes: " + status.getTotalBytes());
    }

    private static void synchronization() {

        var status = new ScanStatus();
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            var thread = new Thread(new ScanFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total Bytes: " + status.getTotalBytes());
    }


}
