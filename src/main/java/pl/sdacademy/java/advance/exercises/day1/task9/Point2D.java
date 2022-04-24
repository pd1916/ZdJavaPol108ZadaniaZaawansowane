package pl.sdacademy.java.advance.exercises.day1.task9;

public class Point2D implements Movable{
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x += moveDirection.getX();
        y += moveDirection.getY();
    }
}
