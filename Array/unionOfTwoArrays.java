package Array;

import java.util.ArrayList;

public class unionOfTwoArrays {

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3 };

        ArrayList<Integer> unionArray = new ArrayList<>();

        int aPtr = 0;
        int bPtr = 0;
        int lastEnteredElement = Integer.MIN_VALUE;

        while (aPtr < a.length || bPtr < b.length) {

            while (aPtr < a.length - 1 && a[aPtr] <= lastEnteredElement) {
                aPtr++;
            }

            while (bPtr < b.length - 1 && b[bPtr] <= lastEnteredElement) {
                bPtr++;
            }

            if (a[aPtr] < b[bPtr]) {
                unionArray.add(a[aPtr]);
                lastEnteredElement = a[aPtr];
                System.out.println("lastEnteredElement = a[aPtr]");
                aPtr++;
                if (aPtr == a.length)
                    break;
            } else if (b[bPtr] < a[aPtr]) {
                unionArray.add(b[bPtr]);
                lastEnteredElement = b[bPtr];
                System.out.println("lastEnteredElement = b[bPtr] wnen bPtr is " + bPtr + "  " + aPtr);
                bPtr++;
                if (bPtr == b.length)
                    break;
            } else {
                unionArray.add(a[aPtr]);
                lastEnteredElement = a[aPtr];
                aPtr++;
                bPtr++;
                if (aPtr == a.length || bPtr == b.length)
                    break;
            }

            // if (aPtr == a.length || bPtr == b.length) {
            // break;
            // }

        }

        while (bPtr == b.length && aPtr < a.length) {
            unionArray.add(a[aPtr]);
            System.out.println("lastEnteredElement = a[aPtr] in broken loop");
            aPtr++;
        }

        while (aPtr == a.length && bPtr < b.length) {
            unionArray.add(b[bPtr]);
            System.out.println("lastEnteredElement = b[bPtr] in broken loop when bPtr is " + bPtr);
            bPtr++;
        }

        // return unionArray;

        System.out.println(unionArray);

    }

}
