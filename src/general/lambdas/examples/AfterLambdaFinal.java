package general.lambdas.examples;

public class AfterLambdaFinal {
    private interface Command {
        void invoke();
    }

    public static void main(String[] args) {
        String message = "hello world";
        Command command = new Command() {
            @Override
            public void invoke() {
                System.out.println(message);
            }
        };
    }
}
