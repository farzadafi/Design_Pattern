package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MugViewEngine  {
    public String render(String path) {
        Path pathFile = Paths.get(path);
        try (Stream<String> lines = Files.lines(pathFile)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path + " View file rendered with mug view engine";
    }
}
