package BinarySearch;

public class binarySearchInRotatedArray {

    public static void main(String args[]) {

        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        if (nums.length == 1) {
            // return nums[0] == target ? 0 : -1;
            if (nums[0] == target) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            System.out.println(mid + " mid while iterations");

            if (nums[mid] == target)
                System.out.println(mid + " mid of final anser");

            if (nums[mid] >= nums[low]) {
                System.out.println("first half is sorted");
                if (target >= nums[low] && target <= nums[mid]) {
                    System.out.println("first half if sorted and target belongs to first half");
                    high = mid - 1;
                    continue;
                } else {
                    System.out.println("first half if sorted and target belongs to second half");
                    low = mid + 1;
                    continue;
                }
            } else {
                System.out.println("second half is sorted");
                if (target >= nums[mid] && target <= nums[high]) {
                    System.out.println("second half if sorted and target belongs to second half");
                    low = mid + 1;
                    continue;
                } else {

                    System.out.println("second half if sorted and target belongs to first half");
                    high = mid - 1;
                    continue;
                }
            }

        }

        System.out.println(-1);
    }
}