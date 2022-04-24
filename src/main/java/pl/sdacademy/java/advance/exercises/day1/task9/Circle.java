package pl.sdacademy.java.advance.exercises.day1.task9;

public class Circle implements Movable{
    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        // sqrt(x2 - x1)^2 + (y2 - y1)^2)
        // gdzie x1, y1 -> point
        //       x2, y2 -> center
        return Math.sqrt(
                Math.pow(center.getX() - point.getX(), 2) +
                        Math.pow(center.getY() - point.getY(), 2));
    }

    public double getPerimeter() {
        // 2 * pi * r
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        // PI * radius^2
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }
}
