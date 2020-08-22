package leetcode.array;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {
  public int removeDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (!set.contains(nums[j])) {
        nums[i++] = nums[j];
        set.add(nums[j]);
      }
    }


    return set.size();
  }
}
