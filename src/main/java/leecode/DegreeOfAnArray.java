package leecode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
	public static void main(String[] args) {
		int[] input = {1, 2, 2, 3, 1, 1, 2, 3, 4, 1};
		System.out.println(findShortestSubArray(input));
	}

	public static int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int degree = map.entrySet().stream().max(Comparator.comparing(integerIntegerEntry -> integerIntegerEntry.getValue())).get().getValue();
		int[] list = map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() == degree)
				.mapToInt(integerIntegerEntry -> integerIntegerEntry.getKey()).toArray();
		int shortest = nums.length;
		for (int integer : list) {
			int begin = 0;
			int end = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == integer) {
					begin = i;
					break;
				}
			}
			for (int j = nums.length - 1; j > 0; j--) {
				if (nums[j] == integer) {
					end = j;
					break;
				}
			}
			if ((end - begin) < shortest) {
				shortest = (end - begin) + 1;
			}
		}

		return shortest;

		// find degree first
		// Get a subarray with the same degree

	}
}
