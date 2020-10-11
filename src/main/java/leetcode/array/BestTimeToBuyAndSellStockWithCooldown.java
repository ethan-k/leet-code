package leetcode.array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithCooldown {
  public int maxProfit(int[] prices) {

    int[][] dp = new int[prices.length + 1][prices.length + 1];

    for (int[] arr : dp)
      Arrays.fill(arr, -1);
    return dp(0, 1, prices, dp);
  }

  public int dp(int prevIdx, int idx, int[] prices, int[][] dp) {
    if (idx >= prices.length)
      return 0;
    int taken = 0;
    if (dp[prevIdx][idx] != -1)
      return dp[prevIdx][idx];
    if (prices[idx] > prices[prevIdx]) {
      taken = prices[idx] - prices[prevIdx] + dp(idx + 2, idx + 2, prices, dp);
    }
    int nottaken = dp(prevIdx, idx + 1, prices, dp);

    dp[prevIdx][idx] = Math.max(taken, Math.max(dp(prevIdx, idx + 1, prices, dp), dp(idx, idx + 1, prices, dp)));

    return dp[prevIdx][idx];

  }
}
