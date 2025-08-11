package List;

import java.util.Arrays;

public class arraysClass {

    public static void main(String args[]) {

        int[] arr = { 5, 9, 6, 7, 12, 66, 7, 22, 3 };

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 66) + " index of the element");

        // Arrays.fill(arr, 12);

        for (int element : arr) {
            System.out.println(element);
        }

    }

}
