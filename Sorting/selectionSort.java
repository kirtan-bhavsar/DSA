package Sorting;

public class selectionSort {

    public static void main(String args[]) {

        int arr[] = { 4, 1, 3, 9, 7 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minNumber = Integer.MAX_VALUE;
            int minNumberIndex = 0;

            for (int j = i; j < arr.length; j++) {

                if (arr[j] < minNumber) {
                    minNumber = arr[j];
                    minNumberIndex = j;
                }

            }

            System.out.println(minNumber + " minNumber " + minNumberIndex + " minNumberIndex " + arr[i] + " arr[i] ");

            int temp = arr[i];
            arr[i] = minNumber;
            arr[minNumberIndex] = temp;

            for (int num : arr) {
                System.out.print(num + " ");
            }

        }

    }

}
