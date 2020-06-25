package day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2020;
        boolean leapYear = year % 4 ==0;
        String result = year + " is leap year: " + leapYear;
        System.out.println(result);
        System.out.println(year + " is leap year: " + leapYear);
    }

}
