package lava.time.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class PlusExample {
    public static void main(String[] args) {
        Instant now = Instant.now();

        // Add/Deduct seconds
        System.out.println(now.plusSeconds(10));
        System.out.println(now.minusSeconds(10));
        
        // Add hours
        System.out.println(now.plus(ChronoUnit.HOURS.getDuration()));
        
        // Add hours (better way)
        System.out.println(now.plus(1, ChronoUnit.HOURS));
        
        // Deduct hours
        System.out.println(now.minus(ChronoUnit.HOURS.getDuration()));
        
        // Deduct hours (better way)
        System.out.println(now.minus(1, ChronoUnit.HOURS));
    }
}
