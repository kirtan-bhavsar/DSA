package Patterns1;

import java.util.Scanner;

public class p9 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = (i * 2) - 1; k > 0; k--) {
                System.out.print("* ");
            }

            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }

            System.out.println("");

        }

        for (int i = num; i > 0; i--) {

            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = (i * 2) - 1; k > 0; k--) {
                System.out.print("* ");
            }

            for (int l = num - i; l > 0; l--) {
                System.out.print("  ");
            }

            System.out.println("");

        }

    }

}
