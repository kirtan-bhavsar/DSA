package Patterns1;

import java.util.Scanner;

public class p20 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i < num * 2; i++) {

            if (i <= num) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                for (int k = i; k < num; k++) {
                    System.out.print("  ");
                }

                for (int l = i; l < num; l++) {
                    System.out.print("  ");
                }

                for (int m = 1; m <= i; m++) {
                    System.out.print("* ");
                }

            } else {

                for (int j = 1; j <= (num * 2) - i; j++) {
                    System.out.print("* ");
                }

                for (int k = 1; k <= i - num; k++) {
                    System.out.print("  ");
                }

                for (int l = 1; l <= i - num; l++) {
                    System.out.print("  ");
                }

                for (int m = 1; m <= (num * 2) - i; m++) {
                    System.out.print("* ");
                }

            }

            System.out.println();

        }

    }

}
