package leetcode.easy;

public class BestTimeToBuyAndSellStock {
    // url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    public int maxProfitRefactor(int[] prices) {
        int maxResult = 0, minStock = Integer.MAX_VALUE;

        int length = prices.length;
        for (int i = 0; i < length; i++) {
            if (prices[i] < minStock) {
                minStock = prices[i];
            } else {
                maxResult = Math.max(prices[i] - minStock, maxResult);
            }
        }

        return maxResult;
    }

    public int maxProfit(int[] prices) {
        int maxResult = 0, benefit = 0;

        int length = prices.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (prices[i] < prices[j]) {
                    benefit = prices[j] - prices[i];
                    maxResult = maxResult > benefit ? maxResult : benefit;
                }
            }
        }

        return maxResult;
    }
}
