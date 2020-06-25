package day28_DataTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime time1 = LocalTime.of(15, 12,56);
        System.out.println(time1);


    }
}
