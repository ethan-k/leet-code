package leecode;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length - 2; i++) {
			for (int j = i + 1; j < prices.length - 1; j++) {
				if (prices[i] < prices[j]) {
					maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
				}
			}
		}
		return maxProfit;
	}
}
