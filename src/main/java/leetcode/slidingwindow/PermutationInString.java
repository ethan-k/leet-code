package leetcode.slidingwindow;

import java.util.HashMap;

public class PermutationInString {
  public boolean checkInclusion(String s1, String s2) {

    HashMap<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      counts.put(s1.charAt(i), counts.getOrDefault(s1.charAt(i), 0) + 1);
    }

    HashMap<Character, Integer> dicts = new HashMap<>();
    int left = 0, right = 0;
    while (right < s2.length()) {
      dicts.put(s2.charAt(right), dicts.getOrDefault(s2.charAt(right), 0) + 1);
      if (right - left + 1 >= s1.length()) {
        if (counts.equals(dicts))
          return true;

        dicts.put(s2.charAt(left), dicts.get(s2.charAt(left)) - 1);
        if (dicts.get(s2.charAt(left)) == 0)
          dicts.remove(s2.charAt(left));
        left++;
      }
      right++;
    }
    return false;
  }
}
