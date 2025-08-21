package BinarySearch;

public class binarySearch {

    public static void main(String args[]) {

        int nums[] = { 5 };
        int target = 5;

        System.out.println(binarySearch(nums, target, 0, nums.length - 1));

    }

    public static int binarySearch(int arr[], int target, int low, int high) {

        while (low <= high) {

            int mid = (low + high + 1) / 2;
            System.out.println(mid);

            if (target == arr[mid])
                return mid;

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return -1;

    }

}
