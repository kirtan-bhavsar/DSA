package Patterns;

public class Pattern14 {

    public static void main(String args[]) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j) + " ");
            }

            System.out.println();

        }

    }

}