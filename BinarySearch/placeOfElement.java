package BinarySearch;

public class placeOfElement {

    public static void main(String args[]) {

        int nums[] = { 1, 3, 5 };
        int target = 4;

        if (target < nums[0])
            System.out.println(0);
        if (target > nums[nums.length - 1])
            System.out.println(nums.length);
        System.out.println(binarySearch(nums, target, 0, nums.length - 1));

    }

    public static int binarySearch(int arr[], int target, int low, int high) {

        int mid = 0;

        while (low <= high) {

            // System.out.println(low + " low");
            // System.out.println(high + " high");

            mid = (low + high + 1) / 2;
            System.out.println(mid + " mid");
            if (target == arr[mid])
                return mid;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return (target > arr[mid] ? mid + 1 : mid);
    }

}
