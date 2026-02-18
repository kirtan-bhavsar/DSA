package Sorting;

public class SelectionSortPractice {

    public static void main(String args[]) {

        int arr[] = { 4, 1, 3, 9, 7 };

        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {

                if (arr[j] <= min) {
                    minIndex = j;
                    min = arr[j];
                    continue;
                } else
                    continue;
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

}
