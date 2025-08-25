package Array;

public class rotateAnArray {

    public static void main(String args[]) {

        int nums[] = { 1, 2, 3, 4 };
        int k = 2;

        int length = nums.length;
        k = k % length;

        rotateArray(nums, 0, k);
        rotateArray(nums, k + 1, length - 1);
        rotateArray(nums, 0, length - 1);

        for (int element : nums) {
            System.out.print(element + " ");
        }

    }

    public static int[] rotateArray(int arr[], int low, int high) {

        while (low <= high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }

        return arr;

    }

}
