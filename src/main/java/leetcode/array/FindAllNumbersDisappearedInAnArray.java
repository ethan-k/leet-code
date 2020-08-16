package leetcode.array;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ret = new ArrayList<>();
    HashSet<Integer> seen = new HashSet<>();
    for(int num: nums) {
      seen.add(num);
    }

    for(int i=1; i<=nums.length;i++) {
      if(!seen.contains(i)) {
        ret.add(i);
      }
    }

    return ret;
  }
}
