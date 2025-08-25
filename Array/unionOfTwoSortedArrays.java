package Array;

import java.util.*;

public class unionOfTwoSortedArrays {

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4 };
        int b[] = { 3, 5, 4 };

        ArrayList<Integer> unionArray = new ArrayList<>();

        // int unionArray[] = new int[nums1.length+nums2.length];
        int num1Index = 0;
        int num2Index = 0;
        int arrIndex = 0;
        unionArray.add(0, Integer.MIN_VALUE);

        System.out.println("Code came till here");

        while (num1Index < a.length || num2Index < b.length) {

            if (num1Index == a.length)
                num1Index = num1Index - 1;
            if (num2Index == b.length)
                num2Index = num2Index - 1;

            if (a[num1Index] <= b[num2Index]) {
                if (a[num1Index] > unionArray.get(arrIndex)) {
                    unionArray.add(arrIndex, a[num1Index]);
                    arrIndex++;
                }
                if (a[num1Index] == b[num2Index])
                    num2Index++;
                num1Index++;
            } else {
                if (b[num2Index] > unionArray.get(arrIndex)) {
                    unionArray.add(arrIndex, b[num2Index]);
                    arrIndex++;
                }
                num2Index++;
            }

            System.out.println("Code came till here in loop");

        }

        System.out.println(unionArray);

    }

}
