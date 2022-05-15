package pl.sdacademy.java.advance.exercises.day3.task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageFinder {
    public static List<String> findImages(Path directory) {
        // .png .jpeg
        try {
            Stream<Path> walk = Files.walk(directory);
            return walk
                    .map(p -> p.toFile().getName())
                    .filter(name -> name.endsWith(".png") || name.endsWith(".jpeg"))
                    .collect(Collectors.toList());
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
