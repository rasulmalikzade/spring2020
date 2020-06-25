package day20_ArrayContinue;

import java.util.Scanner;

public class day0414 {
    public static void main(String[] args) {
        intro();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Your number is " + number);
        int result_square = square (number);
        System.out.println(result_square);
    }
    static int square(int number) {
        return number*number;
    }
    static void intro() {
        System.out.println("salam, welcome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", how are you doing today?");
        String reply = scanner.nextLine();
        System.out.println(reply);
    }
    static int returnfive () {
        return 5;

    }
}