package concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus downloadStatus;

    public DownloadFileTask() {
        downloadStatus = new DownloadStatus();
    }

    public DownloadFileTask(DownloadStatus downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    @Override
    public void run() {
        theWaitAndNotifyMethod();
//        theVolatileKeywordSolvesTheVisibilityProblemNotTheRaceCondition();
//        raceCondition();
    }

    public DownloadStatus getDownloadStatus() {
        return downloadStatus;
    }

    private void raceCondition() {
        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            downloadStatus.incrementTotalBytes();
//            downloadStatus.anotherWayToDoTheJobOfIncrementTotalBytesMethod();
        }
    }

    private static void makeThreadSleep() {
        System.out.println("Downloading file... : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkInterrupt() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            System.out.println("Downloading byte: " + i);
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public void theVolatileKeywordSolvesTheVisibilityProblemNotTheRaceCondition() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            downloadStatus.incrementTotalBytes();
//            downloadStatus.anotherWayToDoTheJobOfIncrementTotalBytesMethod();
        }
        downloadStatus.done();
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public void theWaitAndNotifyMethod() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            downloadStatus.incrementTotalBytes();
//            downloadStatus.anotherWayToDoTheJobOfIncrementTotalBytesMethod();
        }
        downloadStatus.done();
        synchronized (downloadStatus) {
            downloadStatus.notify(); // notify when the state changes
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
