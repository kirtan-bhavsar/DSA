package BinarySearch;

public class shipWithKOrders {

    public static void main(String args[]) {

        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int low = maxWeight(weights);
        System.out.println(low + " low at first");
        int high = sumOf(weights);
        System.out.println(high + " high at first");
        int minDays = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            System.out.println(mid + " mid Calculated");
            int currentWeight = 0;
            int currentDays = 0;

            for (int i = 0; i < weights.length; i++) {

                currentWeight += weights[i];

                if (i == weights.length - 1) {
                    System.out.println("---last iteration---");
                    if (currentWeight <= mid) {
                        currentDays += 1;
                        System.out.println(currentDays + " currentDays for last iteration when less then equal to");
                        break;
                    } else {
                        currentDays += 2;
                        System.out.println(currentDays + " currentDays for last iteration when greater than");
                        break;
                    }
                }

                if (currentWeight == mid) {
                    currentWeight = 0;
                    currentDays += 1;
                    System.out.println(currentDays + " currentDays count when eqaul to");
                    continue;
                } else if (currentWeight > mid) {
                    currentWeight = weights[i];
                    currentDays += 1;
                    System.out.println(
                            currentDays + " currentDays count when greater than " + currentWeight + " currentWeight");
                    continue;
                } else {
                    continue;
                }

            }

            if (currentDays <= days) {
                minDays = mid;
                System.out.println(minDays + " minDays for all the iterations");
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        System.out.println(minDays + " minDays of final answer");

    }

    public static int maxWeight(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max)
                max = arr[i];
        }

        return max;

    }

    public static int sumOf(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }
}
