package leetcode.dynamic;

public class TargetSum {
  int S;

  public int findTargetSumWays(int[] nums, int S) {

    Integer[][] memo = new Integer[nums.length][2001];
    this.S = S;

    return findTargetSumWays(nums, 0, 0, memo);
  }


  public int findTargetSumWays(int[] nums, int i, int sum, Integer[][] memo) {

    if (i == nums.length && sum == S)
      return 1;
    else if (i == nums.length)
      return 0;

    if (memo[i][sum+1000] != null) {
      return memo[i][sum+1000];
    }

    int plus  = findTargetSumWays(nums, i+1, sum - nums[i], memo);
    int minus = findTargetSumWays(nums, i+1, sum + nums[i], memo);

    memo[i][sum+1000] = plus + minus;
    return memo[i][sum+1000];
  }
}
