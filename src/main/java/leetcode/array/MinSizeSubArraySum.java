package leetcode.array;

public class MinSizeSubArraySum {
  public static void main(String[] args) {
    int[] input1 = new int[]{2, 1, 5, 2, 8};
    int[] input2 = new int[]{3, 4, 1, 1, 6};
    System.out.println(findMinSubArray(7, input1));
    System.out.println(findMinSubArray(8, input2));
  }

  public static int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    for (int subArraySize = 1; subArraySize <= arr.length; subArraySize++) {
      int windowStart = 0;
      int currentSum = 0;
      for (int i = 0; i < arr.length; i++) {
        currentSum += arr[i];
        if (currentSum >= S) {
          return subArraySize;
        } else if ((i - windowStart + 1) == subArraySize) {
          currentSum -= arr[windowStart];
          windowStart++;
        }
      }
    }
    return 0;
  }
}
