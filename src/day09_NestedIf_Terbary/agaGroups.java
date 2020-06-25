package day09_NestedIf_Terbary;

import java.util.Scanner;

public class agaGroups {
    public static void main(String[] args) {
        /*write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                 */
        int baby, toddler, kid, pre_teen, teenager, YoungAdult, Adult, YoungMAA,
                MiddleAA, veryYSC, YSC, seniorCitizen, OldseniorCitizen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasi daxil edin");
        int yas = scanner.nextInt();
        if ( 0 <yas && yas <3) {
            System.out.println("it is baby");
        } else if
            ( yas >=3 && yas<=5) {
            System.out.println("it/'is toddler");
        }

    }
}
