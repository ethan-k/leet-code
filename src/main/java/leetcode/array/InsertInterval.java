package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
  public int[][] insert(int[][] intervals, int[] newInterval) {

    if (intervals.length == 0 && newInterval.length == 0)
      return new int[][]{{}};

    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    List<int[]> original = new ArrayList<>();
    original.add(newInterval);
    Collections.addAll(original, intervals);
    original.sort(Comparator.comparingInt(a -> a[0]));

    List<int[]> list = new ArrayList<>();

    int[] mergedNewInterval = original.get(0);
    list.add(mergedNewInterval);
    for (int[] interval : original) {
      if (interval[0] <= mergedNewInterval[1]) {
        mergedNewInterval[1] = Math.max(mergedNewInterval[1], interval[1]);
      } else {
        mergedNewInterval = interval;
        list.add(mergedNewInterval);
      }
    }

    return list.toArray(new int[list.size()][]);

  }
}
