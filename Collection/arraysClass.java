package Collection;

import java.util.*;

public class arraysClass {

    public static void main(String args[]) {

        int arr[] = { 15, 8, 123, 79, 2, 67, 1, 95, 1 };

        Arrays.sort(arr);

        // Arrays.fill(arr, 5);

        int index = Arrays.binarySearch(arr, 123);

        System.out.println(index);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
