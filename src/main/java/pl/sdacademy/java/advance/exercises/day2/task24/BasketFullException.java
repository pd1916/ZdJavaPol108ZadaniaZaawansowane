package pl.sdacademy.java.advance.exercises.day2.task24;

// extends RuntimeException -> unchecked exception
public class BasketFullException extends RuntimeException {
    public BasketFullException(String message) {
        super(message);
    }
}
