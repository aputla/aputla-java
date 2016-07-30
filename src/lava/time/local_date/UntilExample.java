package lava.time.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UntilExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate born = LocalDate.of(1980, 9, 22);
        System.out.println(born.until(now, ChronoUnit.YEARS));
    }
}
