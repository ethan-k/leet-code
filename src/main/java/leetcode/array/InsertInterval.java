package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
  public int[][] insert(int[][] intervals, int[] newInterval) {


    List<int[]> list = new ArrayList<>();
    Collections.addAll(list, intervals);
    list.add(newInterval);
    Collections.sort(list, Comparator.comparingInt(a -> a[0]));

    List<int[]> newIntervals = new ArrayList<>();
    int[] toMerge = list.get(0);

    for(int[] interval: list) {
      if (interval[0] <= toMerge[1]) {
        toMerge[1] = Math.max(interval[1], toMerge[1]);
      } else {
        newIntervals.add(toMerge);
        toMerge = interval;
      }
    }
    newIntervals.add(toMerge);

    return newIntervals.toArray(new int[newIntervals.size()][]);
  }
}
