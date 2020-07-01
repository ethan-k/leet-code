package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class UniqueNumberOfOccurrences {
  public boolean uniqueOccurrences(int[] arr) {

    Map<Integer, Integer> map = new TreeMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    return map.values().stream().distinct().count() == map.keySet().stream().distinct().count();
  }
}
