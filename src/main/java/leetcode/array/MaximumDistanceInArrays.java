package leetcode.array;

import java.util.List;

public class MaximumDistanceInArrays {
  public int maxDistance(List<List<Integer>> arrays) {
    int min = arrays.get(0).get(0);
    int max = arrays.get(0).get(arrays.get(0).size() - 1);
    int maxDistance = 0;
    for (int i = 1; i < arrays.size(); i++) {
      List<Integer> cur = arrays.get(i);
      maxDistance = Math.max(maxDistance, Math.abs(min - cur.get(cur.size() - 1)));
      maxDistance = Math.max(maxDistance, Math.abs(max - cur.get(0)));

      if (max < cur.get(cur.size() - 1)) {
        max = cur.get(cur.size() - 1);
      }
      if (cur.get(0) < min) {
        min = cur.get(0);
      }
    }
    return maxDistance;
  }
}
