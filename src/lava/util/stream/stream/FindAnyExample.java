package lava.util.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result = list.parallelStream()
                .filter(x -> x % 2 == 0)
                .findAny();
        System.out.println(result.get());
    }
}
