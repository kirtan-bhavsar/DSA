package BasicMath;

public class lcmGcd {

    public static void main(String args[]) {

        int a = 6;
        int b = 12;

        if (a == b) {
            // return new int[] {a,b};
            System.out.println("both numbers are same");
        }

        int maxDigit = a > b ? a : b;

        int minDigit = a < b ? a : b;

        ComputeFactors computeFactors = new ComputeFactors();

        int gcd = computeFactors.generate(maxDigit, minDigit);

        int lcm = (a * b) / gcd;

        // return new int[] { lcm, gcd };

        System.out.println(lcm + " is lcm " + gcd + " is gcd");

    }

}

class ComputeFactors {

    public int generate(int num1, int num2) {

        int gcd = 0;

        int conditionLimit = (int) Math.floor(Math.pow(num1, 0.5) + 1);
        System.out.println(conditionLimit + " condition limit");

        for (int i = 1; i < conditionLimit; i++) {

            if (num1 % i == 0) {
                if (num2 % (num1 / i) == 0 && gcd < num1 / i) {
                    System.out.println(num1 / i + " is num /i");
                    gcd = num1 / i;
                } else if (num2 % i == 0 && gcd < i) {
                    System.out.println(i + " is i in the loop");
                    gcd = i;
                } else {
                    continue;
                }
                System.out.println(i + " is i");
            }

        }

        return gcd;

    }
}
