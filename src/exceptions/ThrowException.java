package exceptions;

import java.io.IOException;

public class ThrowException {
    public void deposit(float amount) {
        // defensive programming
        if(amount <= 0)
            throw new IllegalArgumentException();
    }

    // To handle checked exception you have to use the throws keyword as follows
    // Note that: This is for checked exception
    public void checkedException(float value) throws IOException {
        if(value <= 0)
            throw new IOException();
    }

    public void testException() throws IOException {
        try {
            checkedException(-1);
        } catch (IOException e) {
            System.out.println("Logging...");
            throw e; // Re-throw exception
        }
    }

    public void cacheAllException() {
        try {
            testException();
        } catch (Throwable e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
