package pl.sdacademy.java.advance.exercises.day2.task12_task13;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    //point1
    public void add(Car car) {
        cars.add(car);
    }

    //point3
    public List<Car> getAll() {
        return new ArrayList<>(cars); // tworzy modyfikowaną listę/kolekcję
        //return List.copyOf(cars); // tworzy niemodyfikowaną listę/kolekcję
        //return cars; //będziemy cały czas operać na cars
    }
}
