package leecode.dynamic;

import java.util.Arrays;
import java.util.Comparator;

public class CarPooling {
  public boolean carPooling(int[][] trips, int capacity) {

    Arrays.sort(trips, Comparator.comparingInt((int[] a) -> a[2]));
    int totalDistance=trips[trips.length-1][2];
    int[] dp = new int[totalDistance+1];

    for(int[] trip: trips) {
      for(int i=trip[1];i<trip[2];i++){
        dp[i] += trip[0];
        if (dp[i] > capacity)
          return false;
      }
    }
    return true;
  }
}
