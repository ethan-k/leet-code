package leetcode.greedy;

import java.util.PriorityQueue;

public class LastStoneWeight {
  public int lastStoneWeight(int[] stones) {

    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

    for (int stone : stones) {
      queue.add(stone);
    }

    while (queue.size() > 1) {
      int a = queue.poll();
      int b = queue.poll();
      if (a != b) {
        continue;
      } else {
        queue.add(a - b);
      }
    }
    return queue.size() == 1 ? queue.poll() : 0;
  }

}
