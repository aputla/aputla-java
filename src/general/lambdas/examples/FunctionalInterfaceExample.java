package general.lambdas.examples;

public class FunctionalInterfaceExample {
    @FunctionalInterface
    interface Command {
        void print();
    }

    public static void main(String[] args) {
        Command command = () -> System.out.println("hello world");
        command.print();
    }
}
