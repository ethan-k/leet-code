package leetcode.greedy;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        if (nums.length == 1)
            return 0;

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int addition = (nums[i - 1] - nums[i]) + 1;
                nums[i] += addition;
                count = count + addition;
            }
        }
        return count;
    }
}
