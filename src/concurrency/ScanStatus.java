package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ScanStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

//    public void incrementBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        } finally {
//            lock.unlock();
//        }
//    }

    public void incrementBytes() {
        synchronized (this) {
            totalBytes++;
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

}
