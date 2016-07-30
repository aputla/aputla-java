package lava.time.instant;

import java.time.Instant;

public class OfEpochSecondExample {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(0);
        System.out.println(instant);
    }
}
