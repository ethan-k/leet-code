package leetcode.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithAtMostKDistinctCharacters {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {

    int length = 0;
    HashMap<Character, Integer> distinct = new HashMap<>();
    int left = 0, right = 0;

    while (right < s.length()) {
      distinct.put(s.charAt(right), distinct.getOrDefault(s.charAt(right), 0) + 1);
      if (distinct.size() <= k) {
        length = Math.max(length, right - left + 1);
      } else {
        while (distinct.size() > k) {
          distinct.put(s.charAt(left), distinct.get(s.charAt(left)) - 1);
          if (distinct.get(s.charAt(left)) == 0)
            distinct.remove(s.charAt(left));
          left++;
        }
      }
      right++;
    }

    return length;
  }
}
