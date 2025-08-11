package Array;

public class leftRotate {

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int d = 4;

        reverseArray(arr, 0, d - 1);

        reverseArray(arr, d, arr.length - 1);

        reverseArray(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] reverseArray(int arr[], int start, int end) {

        if (start >= end)
            return arr;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, ++start, --end);

        return arr;

    }

}
