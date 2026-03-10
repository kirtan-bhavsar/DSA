package Array;

public class ReturnMajorityElement {

    class Solution {
        public int majorityElement(int[] nums) {

            int count = 0;
            int candidate = 0;

            for (int i = 0; i < nums.length; i++) {

                if (count == 0) {
                    candidate = nums[i];
                    count += 1;
                    continue;
                }

                if (nums[i] == candidate) {
                    count += 1;
                } else {
                    count -= 1;
                }

            }

            return candidate;

        }
    }

}
