package leecode.sort;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
  public int[][] kClosest(int[][] points, int K) {
    if (points.length == 1) {
      return points;
    }
    PriorityQueue<Integer[]> distanceQueue = new PriorityQueue<>((a, b) -> getDistance(b) - getDistance(a));
    for (int[] point : points) {
      distanceQueue.offer(new Integer[]{point[0], point[1]});
      if (distanceQueue.size() > K) {
        distanceQueue.poll();
      }
    }
    int[][] ret = new int[distanceQueue.size()][2];
    int i = 0;
    while (!distanceQueue.isEmpty()) {
      Integer[] point = distanceQueue.poll();
      ret[i][0] = point[0];
      ret[i][1] = point[1];
      i++;
    }
    return ret;
  }

  int getDistance(Integer[] point) {
    return (int) (Math.pow(point[0], 2) + Math.pow(point[1], 2));
  }
}
