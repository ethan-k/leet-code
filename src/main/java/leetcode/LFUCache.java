package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class LFUCache {
  HashMap<Integer, Integer> cache = new HashMap<>();
  HashMap<Integer, Integer> counts = new HashMap<>();
  TreeMap<Integer, LinkedList<Integer>> frequencies = new TreeMap<>();
  int capacity;

  public LFUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    if (!cache.containsKey(key))
      return -1;
    else {
      Integer currentCount = counts.get(key);
      Integer nextCount = currentCount + 1;
      frequencies.get(currentCount).remove(Integer.valueOf(key));

      if (frequencies.get(currentCount).size() == 0) {
        frequencies.remove(currentCount);
      }

      if (!frequencies.containsKey(nextCount)) {
        frequencies.put(nextCount, new LinkedList<>());
      }
      frequencies.get(nextCount).add(key);
      counts.put(key, nextCount);
      return cache.get(key);
    }
  }

  public void put(int key, int value) {
    if (capacity <= 0)
      return;
    if (cache.containsKey(key)) {
      cache.put(key, value);
      get(key);
    } else {
      if (cache.size() >= capacity) {
        Integer lowestFrequency = frequencies.firstKey();
        LinkedList<Integer> sameFreq = frequencies.get(lowestFrequency);
        Integer keyToRemove = sameFreq.getFirst();
        cache.remove(keyToRemove);
        sameFreq.remove(keyToRemove);
        counts.put(keyToRemove, 0);

      }

      cache.put(key, value);
      counts.put(key, 0);
      if (!frequencies.containsKey(0)) {
        frequencies.put(0, new LinkedList<>());
      }
      frequencies.get(0).addLast(key);
    }
  }
}
