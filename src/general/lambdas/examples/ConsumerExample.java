package general.lambdas.examples;

import java.util.function.Consumer;

public class ConsumerExample {
    private static class Builder {
        private String one;
        private String two;

        public Builder one(String one) {
            this.one = one;
            return this;
        }

        public Builder two(String two) {
            this.two = two;
            return this;
        }

        public void build() {
            System.out.println(one + "," + two);
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        Consumer<String> one = text -> builder.one(text);
        Consumer<String> two = text -> builder.two(text);
        one.andThen(two).accept("one");
        builder.build();
    }
}
