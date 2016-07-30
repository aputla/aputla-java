package lava.util.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10);
        list = list.stream()
                   .distinct()
                   .collect(Collectors.toList());
        System.out.println(list);
    }
}
