package Sorting;

public class RecursiveInsertionSort {

    public static void main(String args[]) {

        int arr[] = { 9, 8, 21, 7, 36, 44 };

        // arr = includeInArray(1, arr);
        // arr = includeInArray(2, arr);
        // arr = includeInArray(3, arr);
        // arr = includeInArray(4, arr);

        arr = callIncludeInArray(1, arr.length - 1, arr);

        for (int number : arr) {
            System.out.print(" " + number + " ");
        }
        System.out.println("");

    }

    public static int[] includeInArray(int num, int arr[]) {

        int current = num;
        int prev = current - 1;

        if (prev == 0) {
            if (arr[current] <= arr[prev]) {
                int temp = arr[current];
                arr[current] = arr[prev];
                arr[prev] = temp;
            }
            return arr;
        }

        if (arr[current] <= arr[prev]) {
            int temp = arr[current];
            arr[current] = arr[prev];
            arr[prev] = temp;
        }
        return includeInArray(current - 1, arr);

    }

    public static int[] callIncludeInArray(int currentPass, int totalPasses, int arr[]) {

        if (currentPass == totalPasses) {
            return includeInArray(currentPass, arr);
        }

        arr = includeInArray(currentPass, arr);
        return callIncludeInArray(currentPass + 1, totalPasses, arr);
    }

}
