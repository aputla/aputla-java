package lava.time.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class UntilExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant oneHourFromNow = Instant.now().plus(1, ChronoUnit.HOURS);
        
        System.out.println(now.until(oneHourFromNow, ChronoUnit.HOURS));
    }
}
