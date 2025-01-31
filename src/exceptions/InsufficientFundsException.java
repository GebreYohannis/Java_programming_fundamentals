package exceptions;

// When you define custom exception class follow the following convention
// 1. If it is Checked exception then extend -> Exception builtin class
// 2. If it is an Un-Checked exception then extend -> RuntimeException class

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
