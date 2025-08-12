package Basics;

import java.util.Scanner;

public interface TaxCalculator {

    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Please provide your yearly salary");

        // int salary = sc.nextInt();

        // int taxableSalary = salary - 75000;

        // if (taxableSalary <= 1275000) {
        // System.out.println("Congratulations, you don't have to pay any tax");
        // } else if (taxableSalary > 1275000 && salary <= 1600000) {
        // int slabSalary = taxableSalary - 1200000;
        // double taxPayable = 60000 + ((slabSalary * 15) / 100);
        // System.out.println("The tax you need to pay for " + salary + " is : " +
        // taxPayable);
        // } else if (taxableSalary > 1600000 && salary <= 2000000) {
        // int slabSalary = taxableSalary - 1600000;
        // double taxPayable = 120000 + ((slabSalary * 20) / 100);
        // System.out.println("The tax you need to pay for " + salary + " is : " +
        // taxPayable);
        // } else if (taxableSalary > 2000000 && salary <= 2400000) {
        // int slabSalary = taxableSalary - 2000000;
        // double taxPayable = 200000 + ((slabSalary * 25) / 100);
        // System.out.println(taxPayable);
        // } else {
        // int slabSalary = 2400000 - taxableSalary;
        // double taxPayable = 300000 + ((slabSalary * 30) / 100);
        // System.out.println("The tax you need to pay for " + salary + " is : " +
        // taxPayable);
        // }

        int[] salaries = { 1100000, 1200000, 1300000, 1400000, 1500000, 1600000, 1700000, 1800000, 1900000, 2000000,
                2100000, 2200000, 2300000, 2400000, 2500000, 2600000, 2700000, 2800000, 2900000, 3000000, 6000000,
                1276000 };

        for (int i = 0; i < salaries.length; i++) {

            int salary = salaries[i];

            int taxableSalary = salary - 75000;

            if (taxableSalary <= 1200000) {
                System.out.println("Congratulations, you don't have to pay any tax");
            } else if (taxableSalary > 1200000 && salary <= 1600000) {
                int slabSalary = taxableSalary - 1200000;
                double taxPayable = 60000 + ((slabSalary * 15) / 100);
                System.out.println("The tax you need to pay for " + salary + " is : " + taxPayable);
            } else if (taxableSalary > 1600000 && salary <= 2000000) {
                int slabSalary = taxableSalary - 1600000;
                double taxPayable = 120000 + ((slabSalary * 20) / 100);
                System.out.println("The tax you need to pay for " + salary + " is : " + taxPayable);
            } else if (taxableSalary > 2000000 && salary <= 2400000) {
                int slabSalary = taxableSalary - 2000000;
                double taxPayable = 200000 + ((slabSalary * 25) / 100);
                System.out.println("The tax you need to pay for " + salary + " is : " + taxPayable);
            } else {
                int slabSalary = taxableSalary - 2400000;
                double taxPayable = 300000 + ((slabSalary * 30) / 100);
                System.out.println("The tax you need to pay for " + salary + " is : " + taxPayable);
            }

        }

        // Need to apply marginal relief logic in this

    }

}
