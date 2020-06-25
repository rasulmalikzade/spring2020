package Mini_Proje_Package;

import java.util.Scanner;

public class proje_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-ci sayini gir");
        int sayi1 = scanner.nextInt();
        System.out.println("2-ci sayini gir");
        int sayi2 = scanner.nextInt();
        System.out.println("3-cu sayini gir");
        int sayi3 = scanner.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3) {
            System.out.println("en boyuk sayi : " + sayi1);
        } else if (sayi2>sayi1 && sayi2 > sayi3) {
            System.out.println("en boyuk sayi : " + sayi2);
        } else {
            System.out.println("en boyuk sayi : " + sayi3);
        }
    }
}
