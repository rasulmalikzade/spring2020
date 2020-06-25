package day28_DataTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {
        String [] friends=  {"John", "Rasul", "Tural"};
        LocalDate JoBi = LocalDate.of(2020, 3, 5);
        LocalDate RaBi = LocalDate.of(2000, 10, 12);
        LocalDate TuBi = LocalDate.of(2010, 5,6);

        LocalDate [] birthday = {JoBi, RaBi, TuBi};
        for (int i =0; i < friends.length; i++) {
            String name = friends[i];
            LocalDate bd = birthday[i];
            System.out.println(friends[i] + " = " + birthday[i]);
        }


    }
}
