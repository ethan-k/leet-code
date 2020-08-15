package leetcode.array;

public class BestTimeToBuyAndSellStockTwo {
  public int maxProfit(int[] prices) {
    int min = prices[0];
    int total = 0;
    int max = 0;
    for (int i = 0; i < prices.length; i++) {
      if (i != 0 && prices[i - 1] < prices[i]) {
        max = Math.max(max, prices[i] - min);

      } else {
        min = prices[i];
        total += max;
        max = 0;
      }
    }

    if (max != 0) {
      total += max;
    }

    return total;
  }
}
