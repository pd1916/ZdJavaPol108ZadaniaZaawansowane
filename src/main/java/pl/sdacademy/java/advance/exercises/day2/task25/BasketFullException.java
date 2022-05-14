package pl.sdacademy.java.advance.exercises.day2.task25;

// extends Exception -> checked exception
public class BasketFullException extends Exception {
    public BasketFullException(String message) {
        super(message);
    }
}
