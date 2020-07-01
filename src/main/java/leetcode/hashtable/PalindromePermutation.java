package leetcode.hashtable;

public class PalindromePermutation {
  public boolean canPermutePalindrome(String s) {
    int[] count = new int[128];

    for (char c : s.toCharArray()) {
      if (count[c] == 0) {
        count[c]++;
      } else {
        count[c]--;
      }
    }

    int nonZeroCount = 0;
    for (int value : count) {
      if (value != 0) {
        nonZeroCount++;
      }
    }
    return nonZeroCount <= 1;
  }
}
