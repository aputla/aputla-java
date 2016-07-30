package lava.time.zoned_date_time;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToInstance {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");
        ZonedDateTime result = ZonedDateTime.parse("2013-01-01 00:00 PDT", formatter);
        System.out.println(result);
    }
}
