package Array;

public class buyAndSell {
    public static int main(String args[]) {

        int prices[] = { 7, 6, 3, 8, 4, 9, 1 };

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

        }
        return maxProfit;
    }
}
