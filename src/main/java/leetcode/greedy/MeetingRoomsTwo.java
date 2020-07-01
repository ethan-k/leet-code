package leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsTwo {
  public int minMeetingRooms(int[][] intervals) {

    if (intervals.length == 0) {
      return 0;
    }
    Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[1]));
    int totalDuration = intervals[intervals.length - 1][1];
    int[] dp = new int[totalDuration + 1];

    int overrapCount = 1;

    for (int[] interval : intervals) {
      for (int t = interval[0]; t < interval[1]; t++) {
        dp[t]++;
        overrapCount = Math.max(overrapCount, dp[t]);
      }
    }

    return overrapCount;

  }
}
