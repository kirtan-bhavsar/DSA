package BasicMath;

public class sumOfDivisors {

    public static void main(String args[]) {

        int n = 5;

        int factorialSum = 0;

        ComputeFactors computeFactors = new ComputeFactors();

        for (int i = 1; i <= n; i++) {
            factorialSum += computeFactors.generate(i);
        }

        // return factorialSum;
        System.out.println(factorialSum);

    }
}

class ComputeFactors {

    public int generate(int num) {

        if (num == 1) {
            return 1;
        }

        // num = 36;

        int conditionLimit = (int) Math.floor(Math.pow(num, 0.5) + 1);

        System.out.println(conditionLimit + "condition Limit");

        int factorSum = 0;

        for (int i = 1; i < conditionLimit; i++) {

            if (num % i == 0) {
                if (i == num / i) {
                    factorSum = factorSum + i;
                } else {
                    factorSum = factorSum + i + (num / i);
                }
                System.out.println(factorSum);
            }

        }

        return factorSum;

    }

}
