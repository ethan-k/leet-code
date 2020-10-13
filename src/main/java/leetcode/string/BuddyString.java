package leetcode.string;

import java.util.HashMap;

public class BuddyString {
  public boolean buddyStrings(String A, String B) {
    if (A.length() != B.length())
      return false;

    if (A.isEmpty() || B.isEmpty())
      return false;

    if (A.length() == 1 || B.length() == 1)
      return false;

    HashMap<Character, Integer> dict1 = new HashMap<>();
    HashMap<Character, Integer> dict2 = new HashMap<>();
    int n = A.length();

    int diff = 0;
    for (int i = 0; i < n; i++) {
      if (A.charAt(i) != B.charAt(i)) {
        diff++;
      }
      dict1.put(A.charAt(i), dict1.getOrDefault(A.charAt(i), 0) + 1);
      dict2.put(B.charAt(i), dict2.getOrDefault(B.charAt(i), 0) + 1);
    }

    if (diff > 2)
      return false;

    if (!dict1.keySet().equals(dict2.keySet())) {
      return false;
    }

    int differencePerCharacter = 0;
    for (Character key : dict1.keySet()) {
      differencePerCharacter += Math.abs(dict1.get(key) - dict2.get(key));
    }

    if (differencePerCharacter >= 2) {
      return false;
    }

    if (diff == 0 && differencePerCharacter == 0) {

      if (A.length() == 2 && dict1.keySet().size() != 1) {
        return false;
      } else if (A.length() == 2 && dict1.keySet().size() == 1) {
        return true;
      }

      boolean found = false;
      for (Character key : dict1.keySet()) {
        if (dict1.get(key) == 1)
          continue;
        found = true;
      }

      for (Character key : dict2.keySet()) {
        if (dict2.get(key) == 1)
          continue;
        found = true;
      }
      if (!found) {
        return false;
      }

    }
    return true;
  }
}
