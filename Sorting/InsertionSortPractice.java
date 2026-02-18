package Sorting;

public class InsertionSortPractice {

    public static void main(String args[]) {

        int arr[] = { 6, 12, 5, 9, 55 };

        if (arr.length == 1)
            return;

        int temp = 0;

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j >= 1; j--) {

                if (arr[j] <= arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    continue;
                } else
                    continue;

            }

        }

    }
}