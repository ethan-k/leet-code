package leecode.dynamic;

public class LongestPalindromicSubsequence {
  Integer[][] dp;

  public int longestPalindromeSubseqWithMemo(String s) {
    this.dp = new Integer[s.length()][s.length()];
    return helperWithMemo(s, 0, s.length() - 1);
  }

  int helperWithMemo(String s, int start, int end) {
    if (start > end)
      return 0;
    if (start == end)
      return 1;


    if (dp[start][end] == null) {
      if (s.charAt(start) == s.charAt(end)) {
        return 2 + helperWithMemo(s, start + 1, end - 1);
      }
      int c1 = helperWithMemo(s, start + 1, end);
      int c2 = helperWithMemo(s, start, end - 1);
      dp[start][end] = Math.max(c1, c2);
    }
    return dp[start][end];
  }

  public int longestPalindromeSubseq(String s) {
    return helper(s, 0, s.length() - 1);
  }

  int helper(String s, int start, int end) {
    if (start > end)
      return 0;
    if (start == end)
      return 1;

    if (s.charAt(start) == s.charAt(end)) {
      return 2 + helper(s, start + 1, end - 1);
    }
    int c1 = helper(s, start + 1, end);
    int c2 = helper(s, start, end - 1);

    return Math.max(c1, c2);
  }


}
