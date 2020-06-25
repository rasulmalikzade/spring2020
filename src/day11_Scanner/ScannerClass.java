package day11_Scanner;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        int sum = 0;
        int sum1 = 0;
        for (int i = 0 ; i<=100 ; i++) {
            if (i%2==0) {
                sum+=i;
            } else {
                sum1+=i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);



    }

}



