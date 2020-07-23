package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUnsortedArray {
  public int findUnsortedSubarray(int[] nums) {


    int[] clone = nums.clone();
    Arrays.sort(clone);

    List<Integer> ret = new ArrayList<>();

    int left = 0, right = nums.length - 1;
    while (left < nums.length && nums[left] == clone[left])
      left++;

    if (left < right) {
      while (right >= 0 && nums[right] == clone[right])
        right--;
    }

    return right - left + 1;

  }
}
