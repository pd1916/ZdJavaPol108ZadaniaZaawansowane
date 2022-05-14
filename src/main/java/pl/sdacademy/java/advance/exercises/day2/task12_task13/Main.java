package pl.sdacademy.java.advance.exercises.day2.task12_task13;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Benz", 1880, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes", 1900, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Porshe", 1930, "Germany");

        Car car1 = new Car(
                "GLS",
                "200",
                400_000,
                2020,
                List.of(manufacturer1, manufacturer2),
                EngineType.V12);

        Car car2 = new Car(
                "Cayenne",
                "GTS",
                500_000,
                2019,
                List.of(manufacturer3),
                EngineType.V8);

        carService.add(car1);
        carService.add(car2);
//        List<Car> newCarsServiceList = carService.getAll();
//        System.out.println(newCarsServiceList.size());
//        newCarsServiceList.add(car1);
//        System.out.println();
        List<Car> carsWithV12Engine = carService.getCarsWithV12Engine();
        System.out.println("carsWithV12Engine: " + carsWithV12Engine);
        System.out.println();

        Optional<Car> mostExpensiveCar = carService.getMostExpensiveCar();
        System.out.println("mostExpensiveCar: " + mostExpensiveCar.get());
        System.out.println();

        List<Car> carsSortedByNameAscending = carService.getCarsSortedByName(true);
        System.out.println("carsSortedByNameAscending: " + carsSortedByNameAscending);
        System.out.println();

        List<Car> carsSortedByNameDescending = carService.getCarsSortedByName(false);
        System.out.println("carsSortedByNameDescending: " + carsSortedByNameDescending);
        System.out.println();

        List<Car> carsFoundedBy_1 = carService.getCarsFoundedBy(1905, Operation.GREATER_THAN);
        System.out.println("carsFoundedBy 1905 GREATER_THAN: " + carsFoundedBy_1);
        System.out.println();

        List<Car> carsFoundedBy_2 = carService.getCarsFoundedBy(1899, Operation.LESS_THAN);
        System.out.println("carsFoundedBy 1899 LESS_THAN: " + carsFoundedBy_2);
        System.out.println();

        List<Car> carsFoundedBy_3 = carService.getCarsFoundedBy(1880, Operation.EQUAL);
        System.out.println("carsFoundedBy 1880 EQUAL: " + carsFoundedBy_3);
        System.out.println();

    }
}
