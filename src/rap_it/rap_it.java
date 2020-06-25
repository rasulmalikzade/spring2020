package rap_it;  //56

import java.util.Arrays;
import java.util.Scanner;

public class rap_it {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        double size = scan.nextDouble();
        if (size == 13.3) {
            price=price+200;
        } else if  (size==15.0) {
            price = price + 300;
        } else if (size == 17.3) {
            price = price + 400;
        }


        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        if (cpu.equals("i3")) {
            price += 150;
        } else if (cpu.equals("i5")) {
            price+=250;
        } else if (cpu.equals("i7")) {
            price += 350;
        }
        System.out.println(price);
                /*

        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        System.out.println("Select storage type:");
        storageType = scan.nextLine();

        System.out.println("Enter memory size:");
        int memory = scan.nextInt();

        System.out.println("Enter screen resolution:");
        screenType = scan.nextLine();

        System.out.println("Laptop price is: "+price);

                 */


    }
}






