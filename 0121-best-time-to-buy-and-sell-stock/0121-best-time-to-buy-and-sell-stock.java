class Solution {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0], maxProfit = 0;

        for (int i = 0; i < n; i++) {
            buy = Math.min(buy, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

        return maxProfit;
    }
}
