package leecode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] input = {3,2,3};
		System.out.println(majorityElement(input));
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int majority = nums.length / 2;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() > majority)
				.findFirst().map(integerIntegerEntry -> integerIntegerEntry.getKey()).get();
	}
}
