package Basics;

import java.util.Scanner;

public interface Switch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide your yearly salary");

        int salary = sc.nextInt();

        if (salary <= 1275000) {
            System.out.println("Congratulations, you don't have to pay any tax");
        } else if (salary > 1275000 && salary <= 1600000) {
            int taxableSalary = salary - 75000;
            int slabSalary = taxableSalary - 1200000;
            double taxPayable = 60000 + ((slabSalary * 15) / 100);
            System.out.println("The tax you need to pay is : " + taxPayable);
        } else if (salary > 1600000 && salary <= 2000000) {
            int taxableSalary = salary - 75000;
            int slabSalary = taxableSalary - 1600000;
            double taxPayable = 120000 + ((slabSalary * 20) / 100);
            System.out.println("The tax you need to pay is : " + taxPayable);
        } else if (salary > 2000000 && salary <= 2400000) {
            int taxableSalary = salary - 75000;
            int slabSalary = taxableSalary - 2000000;
            double taxPayable = 200000 + ((slabSalary * 25) / 100);
            System.out.println(taxPayable);
        } else {
            int taxableSalary = salary - 75000;
            int slabSalary = 2400000 - taxableSalary;
            double taxPayable = 300000 + ((slabSalary * 30) / 100);
            System.out.println("The tax you need to pay is : " + taxPayable);
        }

    }

}
