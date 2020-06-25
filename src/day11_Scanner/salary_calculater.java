package day11_Scanner;


import java.util.Scanner;

public class salary_calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Salary: ");
        int salary = input.nextInt();
        System.out.println("your state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;
        System.out.println("Federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax/100.0;

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;
        // salaryAfterTax = salary - totalTax;
        double salaryAfterTax = salary - totalTax;
        System.out.println("Salary after tax: $"  + salaryAfterTax);
        System.out.println("total tax: $" + totalTax);
    }
}
