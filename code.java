class code {

    public static void main(String args[]) {

        int n = 3;

        for (int i = 0; i < 2 * n - 1; i++) {

            if (i < n - 1) {

                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

            } else if (i == n - 1) {
                for (int j = 0; j < 2 * n; j++) {
                    System.out.print("* ");
                }
            } else {

                for (int j = 0; j < (2 * n) - i - 1; j++) {
                    System.out.print("* ");
                }
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (2 * n) - i - 1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }

    }

}
