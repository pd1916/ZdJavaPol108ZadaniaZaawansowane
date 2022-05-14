package pl.sdacademy.java.advance.exercises.day2.task25;

// extends Exception -> checked exception
public class BasketEmptyException extends Exception {
    public BasketEmptyException(String message) {
        super(message);
    }
}
