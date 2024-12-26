package Patterns;

class Pattern9 {
    public static void main(String args[]) {

        int n = 5;

        for (int i = 0; i < n * 2; i++) {

            if (i < n) {

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i * 2) + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
            } else {

                for (int j = 0; j < i - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * ((2 * n) - i) - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }
}
