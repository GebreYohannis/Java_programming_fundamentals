package concurrency;

public class AtomicOperationTask implements Runnable {
    private AtomicOperationStatus status;

    public AtomicOperationTask(AtomicOperationStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        raceCondition();
    }

    public AtomicOperationStatus getStatus() {
        return status;
    }
    
    private void raceCondition() {
        System.out.println("Operation completed: " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalOperation();
        }
    }

}
