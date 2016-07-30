package general.lambdas.examples;

public class BeforeLambdaFinal {
    private interface Command {
        void invoke();
    }

    public static void main(String[] args) {
        final String message = "hello world";
        Command command = new Command() {
            @Override
            public void invoke() {
                System.out.println(message);
            }
        };
    }
}
