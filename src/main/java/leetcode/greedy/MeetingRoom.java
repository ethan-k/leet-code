package leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
  public boolean canAttendMeetings(int[][] intervals) {
    if (intervals.length == 0)
      return true;
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    int[] interval = intervals[0];

    for(int i=1; i<intervals.length; i++) {
      if(intervals[i][0] < interval[1]) {
        return false;
      } else {
        interval = intervals[i];
      }
    }
    return true;
  }
}
