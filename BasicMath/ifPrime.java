package BasicMath;

public class ifPrime {

    public static void main(String args[]) {

        int n = 6;

        int count = 0;

        for (int i = 1; i * i < n; i++) {

            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }

        }

        if (count > 2) {
            System.out.println("The number is not prime.");
        } else {
            System.out.println("The number is prime.");
        }

    }

}
