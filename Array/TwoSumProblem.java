package Array;

import java.util.*;

public class TwoSumProblem {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int findElement = target - nums[i];

            if (hashMap.containsKey(findElement)) {
                return new int[] { hashMap.get(findElement), i };
            } else {
                hashMap.put(nums[i], i);
            }

        }

        return new int[0];

    }
}
