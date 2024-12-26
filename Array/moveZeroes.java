package Array;

public class moveZeroes {
    public static void main(String[] args) {

        int nums[] = { 1, 0, 2, 0, 5, 0, 4, 89, 0 };

        int leftPointer = 0;
        int container = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                container = nums[leftPointer];
                nums[leftPointer] = nums[i];
                nums[i] = container;
                leftPointer++;
            }

        }
    }
}
