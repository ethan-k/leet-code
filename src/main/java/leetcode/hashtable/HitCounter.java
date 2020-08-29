package leetcode.hashtable;

import java.util.*;

public class HitCounter {

  /**
   * Initialize your data structure here.
   */
  TreeMap<Integer, Integer> count = new TreeMap<>();

  public HitCounter() {

  }

  /**
   * Record a hit.
   *
   * @param timestamp - The current timestamp (in seconds granularity).
   */
  public void hit(int timestamp) {
    if (count.containsKey(timestamp)) {
      count.put(timestamp, count.get(timestamp) + 1);
    } else {
      count.put(timestamp, 1);
    }
  }

  /**
   * Return the number of hits in the past 5 minutes.
   *
   * @param timestamp - The current timestamp (in seconds granularity).
   */
  public int getHits(int timestamp) {
    int total = 0;
    for (int count : count.subMap(timestamp + 1 - 300, timestamp + 1).values()) {
      total += count;
    }
    return total;
  }
}