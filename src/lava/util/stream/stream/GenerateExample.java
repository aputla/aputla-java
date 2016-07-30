package lava.util.stream.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(Math::random)
                                       .map(x -> (int) (x * 100));
        System.out.println(stream.limit(10).collect(Collectors.toList()));
    }
}
