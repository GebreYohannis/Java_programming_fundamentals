package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private volatile boolean isDone; // volatile -> unstable
    private int totalBytes;
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        lock.lock();
        try {
            totalBytes++;
        } finally {
            lock.unlock();
        }
    }

    public void anotherWayToDoTheJobOfIncrementTotalBytesMethod(){
        /**
         *
         * Here the <this> keyword refers a monitor object
         * Don't this keyword it is a bad practice
         * Monitor object -> Every object in java has a builtin lock
         *
         */
        // Instead of doing the following
//        synchronized (this) {
//            totalBytes++;
//        }

//        Do the following
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public void incrementTotalFiles() {
        /**
         * The whole point of synchronization is that
         * two thread cannot modify the same data at the same time.
         * So do not pass the <this> keyword as a monitor object
         * because using the same object reduces the throughput of the class
         * that causes unnecessary wait
         */
//
//        synchronized (this) {
//            totalFiles++;
//        }

        synchronized (totalFilesLock) {
            totalFiles++;
        }
    }
 // Instead of using the synchronized keyword as a block
 // we can make the method synchronized as a whole by decorating it
 // with synchronized keyword, but when you do that the monitor object refers this
 // which is the instance of the current class

    public synchronized void makeIncrementTotalBytes() {
        totalBytes++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
