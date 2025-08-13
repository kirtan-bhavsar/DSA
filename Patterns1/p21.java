package Patterns1;

import java.util.Scanner;

public class p21 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
            } else {

                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }

            System.out.println();

        }

    }
}