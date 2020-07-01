package leetcode.array;

public class MaximumProductSubarray {
  public int maxProduct(int[] nums) {

    int max = Integer.MIN_VALUE;
    for(int start=0; start<nums.length; start++) {
      int sum = nums[start];
      max = Math.max(max, sum);
      for (int end=start+1;end<nums.length;end++) {
        sum = sum * nums[end];
        max = Math.max(max, sum);
      }

    }
    return max;
  }
}
