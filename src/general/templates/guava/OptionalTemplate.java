package general.templates.guava;

import com.google.common.base.Optional;

public class OptionalTemplate {
    public static void main(String[] args) {
        Optional<Integer> possibleValue = Optional.absent();
        System.out.println(possibleValue.isPresent());  // false

        possibleValue = Optional.of(1);
        System.out.println(possibleValue.isPresent());  // true

        Integer value = null;
        possibleValue = Optional.fromNullable(value);
        System.out.println(possibleValue.isPresent());  // false

        possibleValue = Optional.fromNullable(null);
        possibleValue.or(10);
        System.out.println(possibleValue.or(10));
    }
}
