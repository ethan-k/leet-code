package leetcode.array;

import java.util.Arrays;

public class RemoveCoveredIntervals {
  public int removeCoveredIntervals(int[][] intervals) {
    if (intervals.length == 1)
      return 0;

    int covered = 0;
    Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1]: a[0] - b[0]);

    int[] standard = intervals[0];
    for (int i = 1; i < intervals.length; i++) {
      if (standard[0] <= intervals[i][0] && intervals[i][1] <= standard[1]) {
        covered++;
      } else {
        standard = intervals[i];
      }
    }

    return intervals.length - covered;
  }
}
