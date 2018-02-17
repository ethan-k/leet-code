package leecode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
			if (integerIntegerEntry.getValue() == 1) {
				result = integerIntegerEntry.getKey();
				break;
			}
		}
		return result;
	}
}
