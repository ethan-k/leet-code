package leetcode.sort;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
  public int[][] kClosest(int[][] points, int K) {
    int[][] ret = new int[K][2];
    PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
      return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
    });
    for (int[] point : points) {
      q.add(point);
    }
    for (int i = 0; i < K; ++i) {
      ret[i] = q.poll();
    }
    return ret;
  }
}
