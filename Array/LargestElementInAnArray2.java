package Array;

import java.util.*;

public class LargestElementInAnArray2 {

    public static int largest(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else {
                continue;
            }

        }

        return max;
    }
}
