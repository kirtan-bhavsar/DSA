package BasicMath;

public class reverseNumber {
    public static void main(String args[]) {

        int x = 265412; // provide any positive/negative number in the int range

        long reversedNumber = 0; // will store the reversed Number
        long lastDigit = 0; // will give the last digit of the number
        boolean isNegative = x < 0; // will define if, the number is positive or negative
        long numCopy = Math.abs(x); // will make a positive copy of

        while (numCopy > 0) {

            lastDigit = numCopy % 10;

            reversedNumber = (reversedNumber + lastDigit) * 10;

            numCopy = numCopy / 10;
        }

        reversedNumber = reversedNumber / 10;

        if (isNegative) {
            reversedNumber = (-1) * reversedNumber;
        }

        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            System.out.println("The number reverse can't be reversed, because it overflows the int range");
            // return 0;
        }

        System.out.println((int) reversedNumber);
        // return (int) reversedNumber;

    }
}