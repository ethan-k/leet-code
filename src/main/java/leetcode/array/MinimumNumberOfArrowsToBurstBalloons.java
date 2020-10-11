package leetcode.array;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
  public int findMinArrowShots(int[][] points) {
    if (points.length == 0)
      return 0;

    Arrays.sort(points, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

    int total = 1;
    int[] newPoint = points[0];
    for (int i = 1; i < points.length; i++) {
      if (points[i][0] <= newPoint[1]) {
        newPoint[1] = Math.min(newPoint[1], points[i][1]);
        System.out.println(Arrays.toString(points[i]));
      } else {
        newPoint = points[i];
        total++;
      }
    }
    return total;
  }
}
