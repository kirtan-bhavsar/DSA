package BasicMath;

public class ifArmstrong {

    public static void main(String args[]) {

        int num = 54749;
        int calculatedNumber = 0;
        int lastDigit = 0;
        double power = (int) Math.floor(Math.log10(num)) + 1;
        System.out.println(power);
        int numCopy = num;

        while (numCopy > 0) {

            lastDigit = numCopy % 10;
            // System.out.println(lastDigit);

            calculatedNumber = calculatedNumber + (int) Math.pow(lastDigit, power);
            // System.out.println(calculatedNumber);

            numCopy = numCopy / 10;
            // System.out.println(numCopy);

        }

        if (calculatedNumber == num) {
            System.out.println("It is an armstrong number");
            System.out.println(calculatedNumber);
            System.out.println(num);
        } else {
            System.out.println("It is not armstrong number");
            System.out.println(calculatedNumber);
            System.out.println(num);
        }

    }
}
