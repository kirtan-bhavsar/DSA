package Patterns1;

import java.util.Scanner;

public class p16 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + i) + " ");
            }

            System.out.println("");

        }

    }

}
