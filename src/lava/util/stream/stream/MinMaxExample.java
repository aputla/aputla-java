package lava.util.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 1, 2, 3, 4, 7, 8);
        System.out.println(list.stream().min(Comparator.comparing(x -> x)).get());
        System.out.println(list.stream().max(Comparator.comparing(x -> x)).get());
    }
}
