package general.lambdas.examples;

import java.util.function.Supplier;

public class SupplierExample {
    private static class Factory {
        public static Integer create() {
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        Supplier<Integer> supplier = Factory::create;
        supplier.get();
    }
}
