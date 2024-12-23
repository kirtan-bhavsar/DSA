package Array;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static int main(String args[]) {

        int[] nums = { 3, 2, 3 };

        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length / 2;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {

            // currentCount = hashMap.getOrDefault(nums[i],0);
            // need to replace the above code

            if (hashMap.containsKey(nums[i])) {
                currentCount = hashMap.get(nums[i]);
            } else {
                hashMap.put(nums[i], 0);
            }

            hashMap.put(nums[i], ++currentCount);
            if (currentCount > n) {
                return nums[i];
            }
        }
        return 0;

    }
}
