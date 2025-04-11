package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOperationStatus {
    private AtomicInteger totalOperation = new AtomicInteger();

    public void incrementTotalOperation() {
       totalOperation.incrementAndGet();
    }

    public int getTotalOperation() {
        return totalOperation.get();
    }
}
