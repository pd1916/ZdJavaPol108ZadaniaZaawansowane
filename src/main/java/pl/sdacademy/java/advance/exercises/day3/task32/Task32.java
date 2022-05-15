package pl.sdacademy.java.advance.exercises.day3.task32;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advance/exercises/day3/task32");
        Path inputFile = dirPath.resolve("cars.txt");
        File file = inputFile.toFile();

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volvo", 300_000, true));
        cars.add(new Car("BMW", 100_000, false));

        save(file, cars);
        List<Car> loaded = load(file);
        System.out.println(loaded);
    }

    private static List<Car> load(File file) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException ex ) {
            System.out.println("Exception : " + ex);
        }
        return null;
    }

    private static void save(File file, List<Car> cars) {
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(file))) {
            oss.writeObject(cars);
        } catch(IOException ex ) {
            System.out.println("Exception : " + ex);
        }
    }
}
