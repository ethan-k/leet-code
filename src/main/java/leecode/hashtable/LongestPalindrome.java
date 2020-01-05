package leecode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
  public int longestPalindrome(String s) {
    char[] chars = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    int ret = 0;
    for (char aChar : chars) {
      if (!map.containsKey(aChar)) {
        map.put(aChar, 1);
      } else {
        map.put(aChar, map.get(aChar) + 1);
        map.remove(aChar);
        ret += 2;
      }
    }

    return map.values().size() == 0 ? ret : ret + 1;
  }
}
