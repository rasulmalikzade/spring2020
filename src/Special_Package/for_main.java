package Special_Package;

import java.util.Scanner;

public class for_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int result = 0;
        do {
            result+=numb%10;
            numb=numb/10;
         } while (numb>0);
        System.out.println(result);


    }
}
