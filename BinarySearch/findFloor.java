package BinarySearch;

public class findFloor {

    public static void main(String args[]) {

        int arr[] = { 3, 3, 4, 5, 6, 6, 8 };
        int x = 4;

        if (x > arr[arr.length - 1])
            System.out.println(-1);

        System.out.println(findFloorOfArray(arr, x, 0, arr.length - 1) + " final answer");

    }

    public static int findFloorOfArray(int arr[], int target, int low, int high) {

        if (low == high)
            return high;

        int mid = low + (high - low) / 2;
        System.out.println(mid + " mid");

        if (mid == low)
            return low;

        if (arr[mid] > target) {
            int a = findFloorOfArray(arr, target, low, mid);
            System.out.println(a + " a");
            return a;
        } else {
            int b = findFloorOfArray(arr, target, mid, high);
            System.out.println(b + " b");
            return b;
        }
    }

}
