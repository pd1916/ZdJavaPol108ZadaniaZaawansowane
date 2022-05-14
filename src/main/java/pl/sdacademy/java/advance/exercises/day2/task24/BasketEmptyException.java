package pl.sdacademy.java.advance.exercises.day2.task24;

// extends RuntimeException -> unchecked exception
public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException(String message) {
        super(message);
    }
}
