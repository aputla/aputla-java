package general.lambdas.examples;

import java.util.Comparator;

public class AfterLambda {
    @FunctionalInterface
    private interface Command {
        void invoke(String message);
    }

    public static void main(String[] args) {
        Command print = message -> System.out.println(message);
        print.invoke("hello");

        Comparator<String> c = (o1, o2) -> o1.compareTo(o2);
        System.out.println(c.compare("1", "2"));
    }
}
