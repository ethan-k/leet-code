package leetcode.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarPooling {
  public boolean carPooling(int[][] trips, int capacity) {

    HashMap<Integer, List<Integer>> starts = new HashMap<>();
    HashMap<Integer, List<Integer>> ends = new HashMap<>();

    for (int[] trip : trips) {
      if (!starts.containsKey(trip[1])) {
        starts.put(trip[1], new ArrayList<>());
      }
      starts.get(trip[1]).add(trip[0]);

      if (!ends.containsKey(trip[2])) {
        ends.put(trip[2], new ArrayList<>());
      }
      ends.get(trip[2]).add(trip[0]);
    }

    int cur = 0;
    for (int trip = 0; trip <= 1000; trip++) {
      if (starts.containsKey(trip)) {
        for (int num : starts.get(trip)) {
          cur += num;
        }
      }

      if (ends.containsKey(trip)) {
        for (int num : ends.get(trip)) {
          cur -= num;
        }
      }

      if (cur > capacity)
        return false;
      if (cur < 0)
        cur = 0;
    }
    return true;
  }
}
