package lava.util.stream.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FlatMapExample {
    public static void main(String[] args) throws IOException {
        String filename = "src/lava/util/stream/stream/FlatMapExample.java";
        Files.lines(Paths.get(filename), Charset.defaultCharset())
             .map(line -> Arrays.asList(line.split("\\s+")))
             .flatMap(list -> list.stream())
             .distinct()
             .forEach(System.out::println);
    }
}
