package leetcode.hashtable;

public class SubarraySumEqualsK {
  public int subarraySum(int[] arr, int k) {
    int count = 0;
    int curSum = 0;
    for (int windowStart = 0; windowStart < arr.length; windowStart++) {
      curSum += arr[windowStart];
      if (curSum == k)
        count++;
      int tempSum = 0;
      for (int j = windowStart + 1; j < arr.length; j++) {
        curSum += arr[j];
        tempSum += arr[j];
        if (curSum == k)
          count++;
      }
      curSum -= tempSum;
      curSum -= arr[windowStart];
    }
    return count;
  }
}
