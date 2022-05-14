package pl.sdacademy.java.advance.exercises.day2.task24;

public class Basket {
    private int itemCounter;

    public Basket() {
        this.itemCounter = 0;
    }

    public void addToBasket() {
        if(itemCounter >= 10) { // można dać itemCounter == 10
            throw new BasketFullException("Too many items is the basket");
        }
        itemCounter++;
    }

    public void removeFromBasket() {
        if(itemCounter <= 0) { //itemCounter == 0
            throw new BasketEmptyException("Can't remove from empty basket");
        }
        itemCounter--;
    }
}
