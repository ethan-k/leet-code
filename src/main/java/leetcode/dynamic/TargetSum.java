package leetcode.dynamic;

public class TargetSum {
  int total = 0;
  int target;

  public int findTargetSumWays(int[] nums, int S) {
    this.target = S;
    sum(0, 0, nums);
    return total;
  }

  void sum(int curSum, int index, int[] nums) {


    if (index == nums.length && curSum == target) {
      total++;
      return;
    } else if (index == nums.length) {
      return;
    }
    sum(curSum + nums[index], index + 1, nums);
    sum(curSum - nums[index], index + 1, nums);
  }
}
