package lava.time.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class IsAfterExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant oneHourFromNow = Instant.now().plus(1, ChronoUnit.HOURS);
        Instant oneHourBeforeNow = Instant.now().minus(1, ChronoUnit.HOURS);
        
        System.out.println(now.isAfter(oneHourBeforeNow));
        System.out.println(now.isBefore(oneHourFromNow));
    }
}
