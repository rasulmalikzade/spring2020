package day07_IfStatements;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number please");
        int inNum = scanner.nextInt();
        System.out.println("Sum of Digits: " + SumOfDigits(inNum));
    }
    public static int SumOfDigits(int inNum) {
        int sum=0;
        while (inNum!=0) {
            sum += inNum % 10;
            inNum = inNum / 10;
        }
        return sum;
        }

}

