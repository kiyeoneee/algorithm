package leetcode.medium;

public class BestTimeToBuyAndSellStockWithCooldown {
    // url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/

    public int maxProfit(int[] prices) {
        int lastSell = 0, sell = 0, buy = Integer.MIN_VALUE, lastBuy;

        for (int price : prices) {
            lastBuy = buy;
            buy = Math.max(lastSell - price, lastBuy);
            lastSell = sell;
            sell = Math.max(lastBuy + price, lastSell);
        }

        return sell;
    }
}
