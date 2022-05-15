package pl.sdacademy.java.advance.exercises.day3.task27;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... parts) {
        /*
        delimeter: -
        parts: 1 2 3 4
        result: 1-2-3-4
         */
        return Arrays.stream(parts)
                //.map(i -> i.toString())
                .map(Objects::toString)
                .collect(Collectors.joining(delimiter));
    }
}
