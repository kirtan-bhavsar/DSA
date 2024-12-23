package Array;

public class missingNumbers {

    public static int main(String args[]) {

        int[] nums = { 0, 1, 3 };

        int total = (nums.length * (nums.length + 1)) / 2;
        int arrayTotal = 0;

        for (int i = 0; i < nums.length; i++) {
            arrayTotal += nums[i];
        }

        return total - arrayTotal;
    }
}
