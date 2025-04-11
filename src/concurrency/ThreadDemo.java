package concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        theWaitAndNotifyMethods();
//        confinement();
//        theVolatileKeyword();
//        locks();
//        raceCondition();
    }

    private static void theVolatileKeyword() {
        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));

        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
            } // wait
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();

    }

    private static void theWaitAndNotifyMethods() {
        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));

        var thread2 = new Thread(() -> {
            /**
             while (!status.isDone()) {}
             * Instead of using an empty block of while loop which
             * causes continuous execution the makes the cpu busy
             * we can make one thread wait and notified by the other if finished
             */
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait(); // Make the thread sleep until another thread notifies it
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }

    private static void strategiesForThreadSafety() {
        /** Thread safe code is a code the can run(execute)
         * concurrently across multiple threads
         * We have 5 strategies to achieve this:
         * 1. Confinement - restrict sharing data across multiple thread
         *   - it is the simplest strategy
         * 2. immutability - using unchangeable object
         * 3. synchronization - prevent multiple threads from accessing
         *      the same resource(object) concurrently
         *    - it is a way of coordinating(synchronizing)
         *    the access to an object across different threads
         *    - we do this by using locks
         *    - Dead lock will happen here
         *    - Dead lock happens when two threads wait for each other  indefinitely
         *    - Synchronization is bad because it is against concurrency.
         *    - We should avoid it as much as possible
         * 4. Atomic objects - using atomic objects like atomic(single) Integer
         *    - this helps to achieve thread safety without using locks
         * 5. Partitioning - partitioning data into segments that can be accessed concurrently
         *   - Only one segment access at a time
         */
    }

    private static void confinement() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
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

        var totalBytes = tasks.stream().map(task -> task.getDownloadStatus().getTotalBytes()).reduce(Integer::sum);
        System.out.println("Total Bytes: " + totalBytes);

    }

    private static void locks() {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
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

    private static void raceCondition() {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
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

    private static void pauseThread() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt(); // send interrupt request
    }

    private static void joinThreadToExecuteOneAfterTheOther() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File is read to be scanned");
    }

    private static void runMultipleThread() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }

    public static void showThread() {
        System.out.println("Thread: " + Thread.activeCount());
        System.out.println("Available Processor: " + Runtime.getRuntime().availableProcessors());
    }
}
