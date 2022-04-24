package pl.sdacademy.java.advance.exercises.day1.task9_task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class Circle_9_Test {
    private Circle circle;

    @BeforeEach
    void setUp() {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 0);
        circle = new Circle(center, point);
    }

    @Test
    void shouldReturnCorrectRadius() {
        // when
        double result = circle.getRadius();
        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldReturnCorrectPerimeter() {
        // when
        double result = circle.getPerimeter();
        System.out.println(result);
        // then
        //assertThat(round(result)).isEqualTo(18.85);
        assertThat(result).isCloseTo(18.84, within(0.01D));
    }

    @Test
    void shouldReturnCorrectArea() {
        // when
        double result = circle.getArea();
        // then
        assertThat(result).isCloseTo(28.27, within(0.01D));
    }

    private double round(double value) {
        // Math.ceil(18.84955592153876 * 100) => 1885 / 100 => 18,85
        return Math.ceil(value * 100) / 100;
    }

}