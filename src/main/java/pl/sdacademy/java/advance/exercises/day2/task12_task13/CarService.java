package pl.sdacademy.java.advance.exercises.day2.task12_task13;

import java.util.*;
import java.util.stream.Collectors;

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

    //point4
    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithVEngine(EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toList());
    }

//    public void getCarsWithVEngineWithPrint(EngineType engineType) {
//        cars.stream()
//                .filter(car -> car.getEngineType().equals(engineType))
//                .forEach(System.out::println);
//    }

    //point6
    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                //.max(Comparator.comparingDouble(car -> car.getPrice()))
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    //point9
    public List<Car> getCarsSortedByName(boolean ascending) {
        if(ascending) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
    }

    //point12
    public List<Car> getCarsFoundedBy(int founded, Operation operation) {
        switch(operation) {
            case GREATER_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedInYear() > founded))
                        .collect(Collectors.toList());
            case LESS_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedInYear() < founded)) //allMatch
                        .collect(Collectors.toList());
            case EQUAL:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedInYear() == founded)) //allMatch
                        .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
