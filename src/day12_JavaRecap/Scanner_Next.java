package day12_JavaRecap;


import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first word");
        String word1 = input.next();
        System.out.println("inout second word");
        String word2 = input.next();
        System.out.println( word1.concat(word2.concat(word2.concat(word1))));

    }
}