package pl.sdacademy.java.advance.exercises.day3.task29;

import java.util.Collection;
import java.util.function.Predicate;

public class CollectionCondition<T> {
    /*
    Test case'y:
    1. input: "java", "python", "scala", "c++", "c#")
       warunek: słowo musi mieć więcej niż 3 znaki
       result: 60% (bo warunek spełniają wyrazy: java, python, scala)
    2. input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
       warunek: liczby większę lub równe 3
       result: 80% (bo warunek spełniają liczby 3-10)

     */
    public static <T> double partOf(Collection<T> collection, Predicate<T> predicate) {
        long count = collection.stream()
                .filter(predicate)
                .count();
        return 100.0 * count / collection.size();
    }
}
