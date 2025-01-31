package exceptions;

// Always unchecked exceptions should extend the RuntimeException class

public class UnCheckedException extends RuntimeException {
    public UnCheckedException(String message) {
        super(message);
    }
}
