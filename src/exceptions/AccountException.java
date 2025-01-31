package exceptions;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause);
    }

    public AccountException(String message) {
        super(message);
    }
}
