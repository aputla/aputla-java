package general.lambdas.examples;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> convertToUpperCase = t -> t.toUpperCase();
        System.out.println(convertToUpperCase.apply("hello"));
    }
}
