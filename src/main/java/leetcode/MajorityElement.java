package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MajorityElement {

  public static void main(String[] args) {
    int[] input = {6, 5, 5};
    System.out.println(majorityElement(input));
  }

  public static int majorityElement(int[] nums) {
    Map<Integer, Integer> count = new HashMap<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));

    for (int num : nums) {
      if (count.containsKey(num)) {
        count.put(num, count.get(num) + 1);
      } else {
        count.put(num, 1);
      }
    }

    count.keySet().forEach(maxHeap::offer);

    return maxHeap.peek();
  }
}
