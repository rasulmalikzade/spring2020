package day28_DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        String dt2 = dt.toString();
        System.out.println(dt2.replace("-", "/"));
        // LocalDateTime dt4 = LocalDateTime.of(LocalDate, LocalTime);
        // 2020-03-20 11:25:30
        LocalDate date = LocalDate.of(2020, 03, 20);
        LocalTime time =LocalTime.of(11, 25, 30);
        LocalDateTime dateTime = LocalDateTime.of (date, time);
        System.out.println(dateTime);

    }
}
