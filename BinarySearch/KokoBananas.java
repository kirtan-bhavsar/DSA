package BinarySearch;

public class KokoBananas {

    public static void main(String args[]) {

        int piles[] = { 30, 11, 23, 4, 20 };

        int h = 6;

        int max = maxBananas(piles);

        if (h == piles.length)

            System.out.println(minBananas(piles, 1, max, h) + " answer got from minBananas");

    }

    public static int minBananas(int arr[], int low, int high, int hours) {

        int mid = (low + high) / 2;

        if (mid == low)
            return high;

        int calcHours = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentCount = arr[i] % mid == 0 ? (arr[i] == mid) ? 1 : arr[i] / mid : (arr[i] / mid) + 1;
            calcHours = calcHours + currentCount;
        }

        if (calcHours > hours) {
            return minBananas(arr, mid, high, hours);
        } else {
            return minBananas(arr, low, mid, hours);
        }

    }

    public static int maxBananas(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;

    }

}
