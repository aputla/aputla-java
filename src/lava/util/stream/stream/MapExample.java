package lava.util.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        list = list.stream()
                   .map(string -> string.toUpperCase())
                   .collect(Collectors.toList());
        System.out.println(list);
    }
}

