package Array;

public class RemoveDuplicatesFromSortArray {

    class Solution {
        public int removeDuplicates(int[] nums) {

            int uniquePtr = 0;
            // int replacePtr = 1;

            for (int j = 1; j < nums.length; j++) {

                if (nums[j] > nums[uniquePtr] && j != uniquePtr + 1) {
                    int temp = nums[j];
                    nums[uniquePtr + 1] = nums[j];
                    nums[j] = temp;
                    uniquePtr++;
                } else if (nums[j] > nums[uniquePtr] && j == uniquePtr + 1) {
                    uniquePtr += 1;
                } else
                    continue;

            }

            return uniquePtr + 1;

        }
    }

}
