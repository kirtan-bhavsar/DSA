package BasicMaths;

public class countNumbers {

    public static void main(String args[]) {

        int n = 464646468;
        int count = 0;
        int numCopy = n;

        while (numCopy > 0) {
            count++;
            numCopy /= 10;
        }

        System.out.println(count);

    }
}