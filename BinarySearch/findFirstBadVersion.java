package BinarySearch;

public class findFirstBadVersion {

    public static void main(String args[]) {

        int n = 5;

        System.out.println(findFirstBadVersionTest(0, n - 1));

    }

    public static int findFirstBadVersionTest(int low, int high) {

        if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;

        if (isBadVersion(mid)) {
            return findFirstBadVersionTest(mid, high);
        } else {
            return findFirstBadVersionTest(low, mid - 1);
        }

        // return 0;

    }

    public static boolean isBadVersion(int bad) {
        return bad == 4;
    }

}
