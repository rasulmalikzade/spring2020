package day28_DataTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, 04, 29, 23,05,30 );
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yy  hh:mm:ss a");
        System.out.println(dateTime.format(dtf));
    }
}
