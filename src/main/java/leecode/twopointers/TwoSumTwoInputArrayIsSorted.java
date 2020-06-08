package leecode.twopointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTwoInputArrayIsSorted {
  public int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (count.containsKey(numbers[i])) {
        return new int[]{count.get(numbers[i]) + 1, i + 1};
      } else {
        count.put(target - numbers[i], i);
      }
    }
    return new int[]{-1, -1};
  }
}
