package Patterns1;

import java.util.Scanner;

public class p17 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + k) + " ");
            }

            if (i != 1) {
                for (int m = i; m > 1; m--) {
                    System.out.print((char) (64 + m - 1) + " ");
                }
            }

            if (i != num) {
                for (int l = num; l > i; l--) {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }

}
