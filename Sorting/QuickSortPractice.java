package Sorting;

public class QuickSortPractice {

    public static void main(String args[]) {

        // int arr[] = { 1 };
        // int arr[] = { 2, 1 };
        // int arr[] = { 1, 2 };
        // int arr[] = { 1, 2, 3 };
        // int arr[] = { 3, 2, 1 };
        // int arr[] = { 9, 8, 15, 6, 2, 78, 36, 1, 58 };
        // int arr[] = { 1, 2, 3, 1, 9, 7, 1, 2, 1 };
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int arr[] = { 3,2,1 };

        arr = quickSort(arr, 0, arr.length - 1);

        System.out.println("---Final result of Quick Sort---");
        printArray(arr);

    }

    public static int[] quickSort(int arr[], int low, int high) {

        if (low == high || high < low)
            return arr;

        int pivot = low;
        int partition = 0;
        int i = low;
        int j = high;

        System.out.println("Array when low is : " + low + " and high is : " + high);
        printArray(arr);

        while (i <= j && i < arr.length - 1 && j > 0) {

            while (arr[i] <= arr[pivot] && i < arr.length - 1) {
                i++;
            }

            while (arr[j] > arr[pivot] && j > 0) {
                j--;
            }

            if (i > j) {
                int temp = arr[pivot];
                arr[pivot] = arr[j];
                arr[j] = temp;
                partition = j;
                System.out.println("Array when i crossed j");
                printArray(arr);
                break;
            } else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                if (i == j && i == arr.length - 1) {
                    int temp1 = arr[pivot];
                    arr[pivot] = arr[j];
                    arr[j] = temp1;
                    partition = j;
                    break;
                }
                System.out.println("Array when a swap got performed");
                printArray(arr);
            }

        }

        quickSort(arr, low, partition - 1);
        quickSort(arr, partition + 1, high);

        return arr;

    }

    public static void printArray(int arr[]) {

        for (int number : arr) {
            System.out.print(" " + number + " ");
        }
        System.out.println();

    }

}
