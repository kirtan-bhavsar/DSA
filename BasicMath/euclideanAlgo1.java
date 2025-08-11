package BasicMath;

public class euclideanAlgo1 {

    public static void main(String args[]) {

        int gcd = 0;
        int a = 5;
        int b = 10;

        int aCopy = a;
        int bCopy = b;

        while (aCopy > 0 && bCopy > 0) {

            if (aCopy > bCopy) {
                aCopy = aCopy % bCopy;
            } else {
                bCopy = bCopy % aCopy;
            }

        }

        if (aCopy == 0) {
            gcd = bCopy;
        } else {
            gcd = aCopy;
        }

        int lcm = a * b / gcd;

        System.out.println(lcm + " = " + gcd);

    }

}
