package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
  public int[][] merge(int[][] intervals) {

    if (intervals.length == 0)
      return new int[0][];

    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    List<int[]> output = new ArrayList<>();
    int[] newInterval = intervals[0];

    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1]) {
        newInterval[1] = Math.max(interval[1], newInterval[1]);
      } else {
        output.add(newInterval);
        newInterval = interval;
      }
    }
    output.add(newInterval);

    return output.toArray(new int[output.size()][]);
  }
}
