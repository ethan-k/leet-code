package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysTwo {
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> count = new HashMap<>();
    List<Integer> ret = new ArrayList<>();

    for (int num : nums1) {
      count.put(num, count.getOrDefault(num, 0) + 1);
    }

    for (int num : nums2) {
      if (count.containsKey(num)) {
        ret.add(num);
        count.put(num, count.get(num) - 1);
        if (count.get(num) == 0) {
          count.remove(num);
        }
      }
    }

    int[] res = new int[ret.size()];

    int i = 0;
    for (Integer num : ret) {
      res[i++] = num;
    }
    return res;
  }
}
