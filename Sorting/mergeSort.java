package Sorting;

public class mergeSort {

    public static void main(String args[]) {

        int arr[] = { 5, 1, 9, 3, 4, 8, 7, 5, 3 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] mergeSort(int arr[], int low, int high) {

        if (low >= high)
            return arr;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return arr;

    }

    public static int[] merge(int arr[], int low, int mid, int high) {

        System.out.println(low + " " + mid + " " + high);

        int temp[] = new int[high - low + 1];
        int index = 0;
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
                index++;
            } else {
                temp[index] = arr[j];
                j++;
                index++;
            }
        }

        while (i <= mid) {
            temp[index] = arr[i];
            index++;
            i++;
        }

        while (j <= high) {
            temp[index] = arr[j];
            index++;
            j++;
        }

        for (int k = low; k <= high; k++) {
            arr[k] = temp[k - low];
        }

        return arr;

    }

}
