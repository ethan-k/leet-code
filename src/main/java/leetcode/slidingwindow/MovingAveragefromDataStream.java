package leetcode.slidingwindow;

import java.util.*;

class MovingAveragefromDataStream {
  int size;
  int total = 0;
  Queue<Integer> queue;

  public MovingAveragefromDataStream(int size) {
    this.size = size;
    this.queue = new LinkedList<>();
  }

  public double next(int val) {
    queue.offer(val);
    total += val;
    if (queue.size() > this.size) {
      int numberToRemove = queue.poll();
      total -= numberToRemove;
    }

    return (double) total / queue.size();
  }
}