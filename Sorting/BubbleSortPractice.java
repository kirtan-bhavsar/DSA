package Sorting;

public class BubbleSortPractice {

    public static void main(String args[]) {

        int arr[] = { 6, 5, 4, 3, 2, 1 };

        if (arr.length == 1)
            return;

        int temp = 0;

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] >= arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    continue;
                } else
                    continue;

            }

        }

    }

}
