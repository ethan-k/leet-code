package leetcode.greedy;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0, right = nums.length-1;
        int ret = Integer.MIN_VALUE;
        while (left < right) {
            ret = Math.max(ret, nums[left] + nums[right]);

            left++;
            right--;
        }

        return ret;
    }
}
