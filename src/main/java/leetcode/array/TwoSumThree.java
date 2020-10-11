package leetcode.array;

import java.util.HashMap;

public class TwoSumThree {

  public static void main(String[] args) {
    var twoSum = new TwoSumThreeKt();
    twoSum.add(0);
    twoSum.add(0);
    System.out.println(twoSum.find(0));
  }

  public TwoSumThree() {

  }

  HashMap<Integer, Integer> map = new HashMap<>();

  /**
   * Add the number to an internal data structure..
   */
  public void add(int number) {
    map.put(number, map.getOrDefault(number, 0) + 1);
  }

  /**
   * Find if there exists any pair of numbers which sum is equal to the value.
   */
  public boolean find(int value) {
    for (int num : map.keySet()) {
      if (map.containsKey(value - num)) {
        if ((value - num) == num) {
          if (map.get(num) > 1) {
            return true;
          }
        } else {
          return true;
        }

      }
    }
    return false;
  }
}
