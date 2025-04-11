package concurrency;

public class ScanFileTask implements Runnable {
    private ScanStatus status;

    public ScanFileTask(ScanStatus status) {
        this.status = status;
    }

    public ScanStatus getStatus() {
        return status;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10_000; i++) {
            status.incrementBytes();
        }
        System.out.println("Scan completed on: " +
                Thread.currentThread().getName());
    }
}
