package day23_Methods;

import java.util.Scanner;

public class method_test_only {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(; j<=n; j++) {
            for (; i<=n; i++) {
                System.out.print("*");
            }


        }

    }
}