package leetcode.array;

public class MaximumLengthOfRepeatedSubarray {
  public int findLength(int[] A, int[] B) {


    int[][] dp = new int[A.length][B.length];
    int ans = 0;
    for (int j = 0; j < B.length; j++) {
      if (A[0] == B[j])
        dp[0][j] = 1;
    }

    for (int i = 0; i < A.length; i++) {
      if (A[i] == B[0])
        dp[i][0] = 1;
    }

    for (int i = 1; i < A.length; i++) {
      for (int j = 1; j < B.length; j++) {
        if (A[i] == B[j]) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        }
        ans = Math.max(ans, dp[i][j]);
      }
    }

    return ans;
  }
}
