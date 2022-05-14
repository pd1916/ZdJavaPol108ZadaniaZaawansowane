package pl.sdacademy.java.advance.exercises.day2.task20_21_22;

import java.util.Objects;

public class Triangle extends Shape {
    private final float a;
    private final float b;
    private final float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    float calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(triangle.a, a) == 0 && Float.compare(triangle.b, b) == 0 && Float.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
