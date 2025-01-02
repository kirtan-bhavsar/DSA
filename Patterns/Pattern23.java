package Patterns;

public class Pattern23 {
    public static void main(String args[]) {

        int n = 4;

        for (int i = 0; i <= (2 * (n - 1)); i++) {

            for (int j = 0; j <= (2 * (n - 1)); j++) {

                int left = j;
                int right = (2 * (n - 1)) - j;
                int top = i;
                int bottom = (2 * (n - 1)) - i;
                int value = n - Math.min(Math.min(left, right), Math.min(top, bottom));

                System.out.print(value);

            }
            System.out.println();

        }

    }
}
