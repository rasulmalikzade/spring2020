package day23_Methods;

import java.util.Scanner;

public class methods_udemy {
    public static int vurma (int a, int b) {
        return (a*b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("hasil: " + vurma(c,d));
    }

}
