package Array;

public class moveZeroesToEnd {

    public static void main(String args[]) {

        int nums[] = { 0, 1, 0, 3, 12 };

        int zeroPointer = Integer.MIN_VALUE;
        int nonZeroPointer = Integer.MIN_VALUE;
        boolean setFirstZeroPointer = true;
        int latestZeroPointer = Integer.MIN_VALUE;
        int totalSwaps = 0;

        for (int i = 0; i < nums.length; i++) {

            System.out.println("----- " + i + " iteration initiated ---");

            if (nums[i] == 0 && setFirstZeroPointer) {
                zeroPointer = i;
                setFirstZeroPointer = false;
                System.out.println(zeroPointer + " first time the zero pointer got set");
            }

            if (nums[i] != 0) {
                nonZeroPointer = i;
                System.out.println(nonZeroPointer + " nonZeroPointer changed when nums[i] != 0");
                if (nonZeroPointer > zeroPointer) {
                    System.out.println(zeroPointer + " zeroPointer when the swap is initiated");
                    System.out.println(nonZeroPointer + " nonZeroPointer when the swap is initiated");
                    int temp = nums[zeroPointer];
                    nums[zeroPointer] = nums[nonZeroPointer];
                    nums[nonZeroPointer] = temp;
                    zeroPointer = latestZeroPointer;
                    totalSwaps++;
                    printArray(nums);
                    System.out.println("array after swaps");
                    System.out.println(zeroPointer + " zeroPointer after swap");
                    System.out.println(nonZeroPointer + " nonZeroPointer after swap");
                }
            }

            if (nums[i] == 0) {
                latestZeroPointer = i;
            }

        }

        for (int element : nums) {
            System.out.println(element);
        }

    }

    public static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
