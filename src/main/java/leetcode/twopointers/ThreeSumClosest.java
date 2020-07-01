package leetcode.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {

    Arrays.sort(nums);
    int ret = nums[0] + nums[1] + nums[nums.length - 1];
    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int curSum = nums[i] + nums[left] + nums[right];
        if (target == curSum) {
          return target;
        } else if (curSum < target) {
          left++;
        } else {
          right--;
        }
        if (Math.abs(target - curSum) < Math.abs(target - ret)) {
          ret = curSum;
        }
      }
    }
    return ret;
  }
}
