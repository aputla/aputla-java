package lava.util.stream.stream;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean result = list.stream().allMatch(x -> x >= 0);
        System.out.println("result:" + result);
    }
}
