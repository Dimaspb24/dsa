package dynamic_programming;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121</a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int[] mins = new int[prices.length];
        int[] maxs = new int[prices.length];

        mins[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            mins[i] = Math.min(mins[i - 1], prices[i]);
        }

        maxs[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxs[i] = Math.max(maxs[i + 1], prices[i]);
        }

        int maxDiff = maxs[0] - mins[0];
        for (int i = 1; i < prices.length; i++) {
            maxDiff = Math.max(maxDiff, maxs[i] - mins[i]);
        }

        return maxDiff;
    }

    /*Динамически считаем локальный максимум и поитогу находим максимум*/
    public int maxProfit2(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            int localProfit = price - minPrice;

            if (localProfit > maxProfit) maxProfit = localProfit;
            if (price < minPrice) minPrice = price;
        }

        return maxProfit;
    }
}
