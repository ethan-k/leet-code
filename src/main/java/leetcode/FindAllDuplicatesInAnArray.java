package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {

    	int[] intput = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(intput));
    }

	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> map =  new HashMap<>();
		Arrays.stream(nums).forEach(value -> {
			if (map.containsKey(value)) {
				map.put(value, map.get(value) + 1);
			} else {
				map.put(value, 1);
			}
		});
		return map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() > 1)
				.map(value -> value.getKey()).collect(Collectors.toList());
	}
}
