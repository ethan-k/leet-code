package leetcode.array;

import java.util.LinkedList;

public class CreateTargetArrayIntheGivenOrder {
  public int[] createTargetArray(int[] nums, int[] index) {
    LinkedList<Integer> list = new LinkedList<>();
    int i = 0;
    while (i < nums.length) {
      list.add(index[i], nums[i]);
      i++;
    }

    int[] ret = new int[nums.length];

    for (int j = 0; j < list.size(); j++) {
      ret[j] = list.get(j);
    }

    return ret;
  }
}
