package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	public static void main(String[] args) {
		int[] inputs = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(inputs);

	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> numList = new ArrayList<>();
		for (int num : nums) {
			numList.add(Integer.valueOf(num));
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i < nums[nums.length - 1]; i++) {
			if (!numList.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}
}
