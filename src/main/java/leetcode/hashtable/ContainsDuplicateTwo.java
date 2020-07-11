package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

class ContainsDuplicateTwo {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> pos = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {

      if (pos.containsKey(nums[i])) {
        if (Math.abs(pos.get(nums[i]) - i) <= k) {
          return true;
        } else {
          pos.put(nums[i], i);
        }
      } else {
        pos.put(nums[i], i);
      }
    }
    return false;
  }
}