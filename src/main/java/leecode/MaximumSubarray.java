package leecode;

public class MaximumSubarray {

  public int maxSubArray(int[] arr) {
    int max = Integer.MIN_VALUE;
    int k = 1;
    while (k <= arr.length) {
      int windowSum = 0;
      int windowStart = 0;
      for (int i = 0; i < arr.length; i++) {
        int windowEnd = i;
        windowSum += arr[i];
        if (k == (windowEnd - windowStart + 1)) {
          max = Math.max(windowSum, max);
          windowSum -= arr[windowStart];
          windowStart++;
        }
      }
      k++;
    }


    return max;
  }
}
