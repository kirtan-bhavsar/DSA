package Sorting;

public class BubbleSortRecursive {

    public static void main(String args[]) {

        int arr[] = { 5, 4, 3, 2, 1 };

        // int passes = arr.length - 1;

        // logic to be replaced by another function
        // int num = 1;

        // while (num <= passes) {
        // arr = putHighestAtEnd(0, num, arr);
        // num++;
        // }

        arr = callPutHighestAtEnd(1, arr.length - 1, arr);

        for (int number : arr) {
            System.out.print(" " + number + " ");
        }
        System.out.println();

    }

    public static int[] putHighestAtEnd(int start, int num, int arr[]) {

        int next = start + 1;

        if (next == arr.length - num) {
            if (arr[start] >= arr[next]) {
                int temp = arr[next];
                arr[next] = arr[start];
                arr[start] = temp;
            }
            return arr;
        }

        if (arr[start] >= arr[next]) {
            int temp = arr[next];
            arr[next] = arr[start];
            arr[start] = temp;
        }

        return putHighestAtEnd(start + 1, num, arr);

    }

    public static int[] callPutHighestAtEnd(int pass, int totalPasses, int arr[]) {

        if (pass == totalPasses) {
            return putHighestAtEnd(0, pass, arr);
        }

        arr = putHighestAtEnd(0, pass, arr);
        return callPutHighestAtEnd(pass + 1, totalPasses, arr);

    }

}
