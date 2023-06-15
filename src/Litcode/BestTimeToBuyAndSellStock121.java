package Litcode;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));//5
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        if (prices == null || prices.length < 1) return 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
