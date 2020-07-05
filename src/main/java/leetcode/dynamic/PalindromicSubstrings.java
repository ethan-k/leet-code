package leetcode.dynamic;

public class PalindromicSubstrings {
  int total = 0;

  public int countSubstrings(String s) {
    helper(s, 0);
    return total;
  }


  void helper(String s, int idx) {

    if (idx >= s.length())
      return;

    for (int i = idx; i < s.length(); i++) {
      if (isPalinDrome(s.substring(idx, i + 1))) {
        total++;
      }
    }
    helper(s, idx + 1);
  }


  boolean isPalinDrome(String s) {

    int left = 0;
    int right = s.length() - 1;
    while (left <= right) {
      if (s.charAt(left) != s.charAt(right))
        return false;
      left++;
      right--;
    }

    return true;
  }
}
