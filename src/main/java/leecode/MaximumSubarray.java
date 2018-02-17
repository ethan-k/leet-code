package leecode;
import java.util.Arrays;
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] src = new int[] {1, 2, 3, 4, 5};
		int b1[] = Arrays.copyOfRange(src, 0, 2);
		maxSubArray(src);
	}
	public static int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int result = 0;
		for (int num : nums) {
			result+=num;
		}
		return Math.max(result, maxSubArray(Arrays.copyOfRange(nums, 1, nums.length)));
	}
}
