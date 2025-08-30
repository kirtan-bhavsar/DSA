package BinarySearch;

public class frequencyOfElements {

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;

        if (target > arr[arr.length - 1])
            System.out.println(0);
        if (target < arr[0])
            System.out.println(0);

        int firstOccurance = firstOccurance(arr, target, 0, arr.length - 1);
        System.out.println(firstOccurance + " firstOccurance");
        int lastOccurance = lastOccurance(arr, target, 0, arr.length - 1);
        System.out.println(lastOccurance + " lastOccurance");

        System.out.println(lastOccurance - firstOccurance + 1);
        System.out.println(" result");
    }

    public static int firstOccurance(int arr[], int target, int low, int high) {

        int mid = low + (high - low) / 2;

        System.out.println(mid + " mid for fO");

        int firstOccurance = 0;

        while (low <= high) {
            if (arr[mid] >= target) {
                System.out.println("arr[mid] >= target for fO");
                if (arr[mid] == target) {
                    firstOccurance = mid;
                }
                high = mid - 1;
            } else {
                System.out.println(" else for fO");
                low = mid + 1;
            }
        }

        return firstOccurance;

    }

    public static int lastOccurance(int arr[], int target, int low, int high) {

        int mid = low + (high - low) / 2;

        System.out.println(mid + " mid for lO");

        int lastOccurance = 0;

        while (low <= high) {
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                if (arr[mid] == target) {
                    lastOccurance = mid;
                }
                low = mid + 1;
            }
        }

        return lastOccurance;

    }

}
