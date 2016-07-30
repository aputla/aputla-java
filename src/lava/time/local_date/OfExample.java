package lava.time.local_date;

import java.time.LocalDate;
import java.time.Month;

public class OfExample {
    public static void main(String[] args) {
        LocalDate now;
        
        now = LocalDate.of(1980, 9, 22);
        System.out.println(now);
        
        now = LocalDate.of(1980, Month.SEPTEMBER, 22);
        System.out.println(now);
    }
}
