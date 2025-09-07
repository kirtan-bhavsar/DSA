package BinarySearch;

public class pages {

    public static void main(String args[]) {

        int arr[] = { 15, 10, 19, 10, 5, 18, 7 };
        int k = 5;

        int low = maxOf(arr);
        int high = sumOf(arr);
        int minOfMaxPages = 0;

        while (low <= high) {

            System.out.println("---the iteration will start for the low : " + low);

            int mid = low + (high - low) / 2;
            System.out.println("---the iteration will start for the mid : " + mid);

            System.out.println("---the iteration will start for the mid : " + high);

            int currentPageCount = 0;
            int studentCount = 1;

            for (int i = 0; i < arr.length; i++) {

                if (currentPageCount + arr[i] > mid) {
                    currentPageCount = arr[i];
                    studentCount += 1;
                } else {
                    currentPageCount += arr[i];
                }

            }

            System.out.println("---student count when the for loop breaks " + studentCount);
            if (studentCount <= k) {
                minOfMaxPages = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        System.out.println(minOfMaxPages + " final answer");

    }

    public static int maxOf(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element >= max)
                max = element;
        }

        System.out.println(max + " from finding max");
        return max;
    }

    public static int sumOf(int arr[]) {

        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        System.out.println(sum + " from finding sum");
        return sum;

    }

}
