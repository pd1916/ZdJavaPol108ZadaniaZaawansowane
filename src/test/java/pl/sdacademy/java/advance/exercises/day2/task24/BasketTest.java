package pl.sdacademy.java.advance.exercises.day2.task24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BasketTest {
    private Basket basket;

    @BeforeEach
    void setUp() {
        basket = new Basket();
    }

    @Test
    void shouldNotBePossibleToAddNewItemWhenBasketIsFull() {
        //given
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        //when & then
        assertThatThrownBy(() -> basket.addToBasket())
                .isInstanceOf(BasketFullException.class)
                .hasMessage("Too many items is the basket");
    }

    @Test
    void shouldNotBePossibleToRemoveItemWhenBasketIsEmpty() {
        //when & then
        assertThatThrownBy(() -> basket.removeFromBasket())
                .isInstanceOf(BasketEmptyException.class);
    }

}