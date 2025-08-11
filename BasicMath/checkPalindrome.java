package BasicMath;

public class checkPalindrome {

    public static void main(String args[]) {

        int x = 12321;

        if (x < 0) {
            // return false;
            System.out.println("The number is negative");
        }

        long reversedNumber = 0;
        long numCopy = x;
        long lastDigit = 0;

        while (numCopy > 0) {

            lastDigit = numCopy % 10;

            reversedNumber = (reversedNumber + lastDigit) * 10;

            numCopy = numCopy / 10;

        }

        reversedNumber = reversedNumber / 10;

        // return x == reversedNumber;
        if (reversedNumber == x) {
            System.out.println(reversedNumber + " is palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }
}
