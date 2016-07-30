package lava.util.stream.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream.collect(Collectors.toList()));
    }
}
