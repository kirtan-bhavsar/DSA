package Array;

public class moveElementsToLeft {

    public static void main(String args[]) {

        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        int tempArr[] = new int[nums.length];
        int tempIndex = 0;
        // int length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                tempIndex = (i - k) % nums.length;
            } else {
                tempIndex = nums.length - k + i;
            }

            tempArr[tempIndex] = nums[i];

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArr[i];
            System.out.print(nums[i] + " ");
        }

    }
}
