package Patterns1;

import java.util.Scanner;

public class p10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            for (int k = num - i; k > 0; k--) {
                System.out.print("  ");
            }

            System.out.println();

        }

        for (int i = num; i > 1; i--) {

            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }

            for (int k = 0; k < num - i + 1; k++) {
                System.out.print("  ");
            }

            System.out.println();

        }

    }

}
