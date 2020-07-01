package leetcode.hashtable;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("ab"));
  }

  public int lengthOfLongestSubstring(String s) {

    if (s.isEmpty()) {
      return 0;
    }
    int ret = 1;
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); ++i) {
      set.add(s.charAt(i));
      int j = i + 1;
      for (; j < s.length(); j++) {
        if (set.contains(s.charAt(j))) {
          break;
        }
        set.add(s.charAt(j));
      }
      ret = Math.max(ret, j - i);
      set.clear();
    }

    return ret;
  }
}
