class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int high = 1;
        int maxProfit = 0;

        while (high < prices.length) {
            if (prices[high] > prices[low]) {
                maxProfit = Math.max(maxProfit, prices[high] - prices[low]);
            } else {
                low = high;
            }
            high++;
        }

        return maxProfit;
    }
}
