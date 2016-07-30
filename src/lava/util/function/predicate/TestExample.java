package lava.util.function.predicate;

import java.util.function.Predicate;

public class TestExample {
    public static void main(String[] args) {
        Predicate<String> isEmptyString = input -> input.isEmpty();
        isEmptyString.test("");
    }
}
