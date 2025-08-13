package Patterns1;

import java.util.Scanner;

public class p22 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i < num * 2; i++) {

            for (int j = 1; j < num * 2; j++) {

                int minPosition = Math.min(Math.min(i - 1, j - 1), Math.min(((num * 2) - 1 - i), ((num * 2) - 1 - j)));

                System.out.print(num - minPosition);

            }

            System.out.println();

        }

    }
}