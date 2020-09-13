package leetcode.hashtable;

import java.util.*;

public class WordPattern {
  public boolean wordPattern(String pattern, String str) {

    Map<Character, String> mapping = new HashMap<>();
    Set<String> seen = new HashSet<>();
    
    int i = 0, j = 0;

    char[] patterns = pattern.toCharArray();
    String[] split = str.split(" ");

    if (patterns.length != split.length)
      return false;

    while (i < patterns.length && j < split.length) {

      if (mapping.containsKey(patterns[i])) {
        if (!mapping.get(patterns[i]).equals(split[j])) {
          return false;
        }
      } else {
        if (seen.contains(split[j])) {
          return false;
        }
        mapping.put(patterns[i], split[j]);
        seen.add(split[j]);
      }

      i++;
      j++;
    }

    return true;
  }
}
