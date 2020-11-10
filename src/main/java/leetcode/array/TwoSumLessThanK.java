package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLessThanK {
  public int twoSumLessThanK(int[] A, int K) {

    int ans = -1;
    HashMap<Integer, Integer> location = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      location.put(A[i], i);
    }

    Arrays.sort(A);

    for (int num : A) {
      int search = binarySearch(A, K - num);
      if (search != -1 && (location.get(num) != location.get(search))) {
        ans = Math.max(ans, num + search);
      }
    }

    return ans;
  }

  public int binarySearch(int[] A, int target) {
    int left = 0, right = A.length - 1;
    int ans = -1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (A[middle] < target) {
        ans = A[middle];
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }
    return ans;
  }
}
