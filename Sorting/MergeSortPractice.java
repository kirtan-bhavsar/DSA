package Sorting;

public class MergeSortPractice {

    public static void main(String args[]) {

        // int nums[] = { 8, 2, 6, 7, 12, 3, 1 };
        // int nums[] = { 1 };
        // int nums[] = { 1, 2 };
        // int nums[] = { 3, 2, 1 };
        // int nums[] = { 0, 1, 0, 1, 0, 1, 1, 10 };
        int nums[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        printArray(nums);

        nums = mergeSort(nums, 0, nums.length - 1);

        printArray(nums);
    }

    public static int[] mergeSort(int nums[], int l, int r) {

        int mid = (l + r) / 2;

        if (l == r)
            return nums;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        return mergeArray(nums, l, r);

    }

    public static int[] mergeArray(int nums[], int l, int r) {

        // System.out.println("Merge starts when l is " + l + " and r is : " + r + " ");
        // System.out.println("Merge array at the start");
        // printArray(nums);

        int mid = (l + r) / 2;

        int j = l;
        int k = mid + 1;
        int temp[] = new int[r - l + 1];
        // printArray(temp);
        int tempPtr = 0;

        // System.out.println("");
        // System.out.println("for this case j is : " + j + " and k is " + k + " " + "
        // and mid is : " + mid);

        if (j == mid + 1 && k == r + 1)
            return nums;

        while (j <= mid && k <= r) {

            if (nums[j] <= nums[k]) {
                // System.out.println("while and in that if called");
                temp[tempPtr] = nums[j];
                // printArray(temp);
                j++;
                tempPtr++;
            } else {
                // System.out.println("while and in that else called");
                temp[tempPtr] = nums[k];
                // printArray(temp);
                k++;
                tempPtr++;
            }

        }

        while (j == mid + 1 && k <= r) {
            // System.out.println("if called where first array ended");
            temp[tempPtr] = nums[k];
            // printArray(temp);
            k++;
            tempPtr++;
        }

        while (k == r + 1 && j <= mid) {
            // System.out.println("if called where second array ended");
            temp[tempPtr] = nums[j];
            // printArray(temp);
            j++;
            tempPtr++;
        }

        // System.out.println("Temp for merge is as follows");
        // printArray(temp);
        tempPtr = 0;

        for (int i = l; i <= r; i++) {
            nums[i] = temp[tempPtr];
            tempPtr++;
        }

        // System.out.println("Array when l is : " + l + " and r is : " + r + " ");
        // printArray(nums);
        return nums;

    }

    public static void printArray(int nums[]) {

        for (int number : nums) {
            System.out.print(" " + number + " ");
        }

        System.out.println();

    }

}
