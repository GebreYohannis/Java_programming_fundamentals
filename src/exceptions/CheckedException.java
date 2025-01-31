package exceptions;

// Always Checked exceptions should extend the Exception class
public class CheckedException extends Exception {
  public CheckedException(String message) {
    super(message);
  }
}
