package Patterns1;

import java.util.Scanner;

public class p19 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num * 2; i++) {

            if (i <= num) {

                for (int j = i; j <= num; j++) {
                    System.out.print("* ");
                }

                for (int k = 1; k < i; k++) {
                    System.out.print("  ");
                }

                for (int l = 1; l < i; l++) {
                    System.out.print("  ");
                }

                for (int m = i; m <= num; m++) {
                    System.out.print("* ");
                }

            } else {

                for (int j = 1; j <= i - num; j++) {
                    System.out.print("* ");
                }

                for (int k = 1; k <= (num * 2) - i; k++) {
                    System.out.print("  ");
                }

                for (int l = 1; l <= (num * 2) - i; l++) {
                    System.out.print("  ");
                }

                for (int m = 1; m <= i - num; m++) {
                    System.out.print("* ");
                }

            }

            System.out.println();

        }

    }

}
