package lava.util.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        list = list.stream()
                   .filter(x -> x % 2 == 0)
                   .skip(5)
                   .collect(Collectors.toList());
        System.out.println(list);
    }
}
