class code {

    public static void main(String args[]) {

        int n = 3;

        for (int i = 0; i < 2 * n; i++) {

            if (i < n) {

                for (int j = 0; j < n - i; j++) {
                    System.out.print("a");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("b");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("c");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("d");
                }

            } else {

                for (int j = 0; j <= i - n; j++) {
                    System.out.print("a");
                }
                for (int j = 0; j <= n - i + 1; j++) {
                    System.out.print("b");
                }
                for (int j = 0; j <= n - i + 1; j++) {
                    System.out.print("c");
                }
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("d");
                }

            }

            System.out.println();

        }

    }

}
