package lava.util.stream.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, x -> x + 10);
        System.out.println(stream.limit(10).collect(Collectors.toList()));
    }
}
