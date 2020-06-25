package day23_Methods;

import java.util.Scanner;
public class UniqueValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        for (int j=0; j<str.length(); j++) {
            char ch2 = str.charAt(j);
            int count = 0;
             for (int i =0; i<str.length(); i++) {
                 char ch = str.charAt(i);
                 if (ch==ch2) {
                     count++;
                 }
             }
             if (count == 1) {
                 result+=ch2;
             }
        }
        System.out.println(result);
    }
}
