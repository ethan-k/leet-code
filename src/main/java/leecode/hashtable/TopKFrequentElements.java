package leecode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {
  public List<Integer> topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> count = new HashMap<>();

    for (int num : nums) {
      count.put(num, count.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> count.get(a) - count.get(b));

    for (int num : count.keySet()) {
      queue.add(num);
      if (queue.size() > k) {
        queue.poll();
      }
    }
    return new ArrayList<>(queue);
  }
}
