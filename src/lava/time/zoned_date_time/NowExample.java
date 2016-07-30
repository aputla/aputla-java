package lava.time.zoned_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NowExample {
    public static void main(String[] args) {
        ZonedDateTime zdt = LocalDateTime.now().atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(zdt);
    }
}
