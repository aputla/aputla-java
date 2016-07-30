package lava.util.stream.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectExample {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> list1 = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1);
        
        // AnyList
        List<Integer> list2 = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
