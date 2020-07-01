package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ret = new int[nums.length];
    int[] sorted = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sorted);

    Map<Integer, Integer> position = new HashMap<>();
    for (int i = nums.length - 1; i >= 0; i--) {
      position.put(sorted[i], i);
    }

    for (int i = 0; i < ret.length; ++i) {
      ret[i] = position.get(nums[i]);
    }

    return ret;
  }
}
