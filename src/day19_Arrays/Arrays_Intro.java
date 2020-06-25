package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Intro {
    public static void main(String[] args) {
        String name [] = new String[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (; i<4; i++) {
            name[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(name));



    }
}

