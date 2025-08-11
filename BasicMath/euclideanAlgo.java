package BasicMath;

public class euclideanAlgo {

    public static void main(String args[]) {

        int a = 14;
        int b = 8;

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int temp = 0;

        while (min != 0) {
            temp = max - min;
            System.out.println(temp + " is temp.");
            max = Math.max(min, temp);
            System.out.println(max + " is max then why zero.");
            min = Math.min(min, temp);
            System.out.println(min + " is min.");
            if (min == 0) {
                break;
            }
        }

        int gcd = max;
        int lcm = a * b / gcd;

        System.out.println(lcm + " = " + gcd);

        // int gcd = 0;
        // int aCopy = a;
        // int bCopy = b;

        // while (aCopy > 0 && bCopy > 0) {

        // if (a > b) {
        // aCopy = aCopy % bCopy;
        // } else {
        // bCopy = bCopy % aCopy;
        // }

        // }

        // if (aCopy == 0) {
        // gcd = bCopy;
        // } else {
        // gcd = aCopy;
        // }

        // int lcm = a * b / gcd;

        // // return new int[] {lcm,gcd};
        // System.out.println(lcm + " = " + gcd);

    }

}
