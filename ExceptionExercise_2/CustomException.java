package ExceptionExercise_2;

// CustomException.java
public class CustomException extends Exception {
    public CustomException() {
        super("Custom exception occurred");
    }

    public CustomException(String message) {
        super(message);
    }
}
