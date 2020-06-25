package Methods_VariableScope_Conditionals_Loops;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        intro(); // welcome intro

        Scanner scanner = new Scanner(System.in); //asking number
        System.out.println("What is your number?");
        int number = scanner.nextInt();
        int result_square = square(number);  //square - method
        System.out.println(result_square);   // square result
    }
    static int square(int x) {
        return x*x;
    }
    static void intro() {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome mr." + name + ",");

    }

}
