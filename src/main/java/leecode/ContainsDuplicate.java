package leecode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static void main(String[] args) {

  }

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> integers = new HashSet<>();
    for (int num : nums) {
      if (integers.contains(Integer.valueOf(num))) {
        return true;
      }
      integers.add(num);
    }
    return false;
  }
}
