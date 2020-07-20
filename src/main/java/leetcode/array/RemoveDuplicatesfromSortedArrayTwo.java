package leetcode.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedArrayTwo {
  public int removeDuplicates(int[] nums) {
    // At most twice
    // sorted
    int n = nums.length;
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < nums.length; i++) {


      if (map.getOrDefault(nums[i], 0) < 2) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      }
    }

    int i = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      for (int j = 0; j < entry.getValue(); j++) {
        nums[i++] = entry.getKey();
      }
    }
    return i;

  }
}
