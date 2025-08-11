package BasicMath;

public class countDigits {

    public static void main(String args[]) {

        int n = 2446;

        int digits = n;
        int digit = 0;
        int count = 0;

        while (digits > 0) {

            digit = digits % 10;

            if (n % digit == 0) {
                count++;
            }

            digits = digits / 10;
        }

        System.out.println(count);

    }

}
