package Patterns1;

import java.util.Scanner;

public class p11 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }

            System.out.println("");

        }

    }

}
