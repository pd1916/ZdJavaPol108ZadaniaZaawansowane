package pl.sdacademy.java.advance.exercises.day2.task20_21_22;

public class Hexagon extends Shape{
    private final float a;

    public Hexagon(float a) {
        this.a = a;
    }

    @Override
    float calculatePerimeter() {
        return 6 * a;
    }
}
