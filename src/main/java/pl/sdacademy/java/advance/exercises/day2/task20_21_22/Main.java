package pl.sdacademy.java.advance.exercises.day2.task20_21_22;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3, 4);
        float trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        float hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagonPerimeter: " + hexagonPerimeter);

        Shape rectangle = new Rectangle(2, 3);
        float rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("rectanglePerimeter: " + rectanglePerimeter);

        Shape3D cube = new Cube(2);
        float cubeVolume = cube.calculateVolume();
        float cubePerimeter = cube.calculatePerimeter();
        System.out.println("cubeVolume: " + cubeVolume);
        System.out.println("cubePerimeter: " + cubePerimeter);

        int fillResult = cube.fill(7);
        System.out.println("Fill 7, result: " + fillResult);
        fillResult = cube.fill(8);
        System.out.println("Fill 8, result: " + fillResult);
        fillResult = cube.fill(9);
        System.out.println("Fill 9, result: " + fillResult);

//        Shape cube2 = new Cube(2);
//        ((Cube)cube2).calculateVolume();
    }
}
