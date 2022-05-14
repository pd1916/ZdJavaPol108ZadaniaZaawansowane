package pl.sdacademy.java.advance.exercises.day2.task25;

public class Task25 {
    public static void main(String[] args) throws BasketEmptyException {
        /*
        jak obsłużyć wyjątek checked:
         1. blok try-catch np. addToBasket
         2. throws na na poziomie metody np. removeFromBasket
         UWAGA: preferowana opacja to #1 z try-catch
         */
        Basket basket = new Basket();
        try {
            basket.addToBasket();
        } catch(BasketFullException e) {
            System.out.println(e);
        }
        basket.removeFromBasket();
    }
}
