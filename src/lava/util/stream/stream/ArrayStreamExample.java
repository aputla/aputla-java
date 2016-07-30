package lava.util.stream.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStreamExample {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(A);
        System.out.println(stream.boxed().collect(Collectors.toList()));
    }
}
