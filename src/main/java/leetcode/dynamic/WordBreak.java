package leetcode.dynamic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
  Set<String> set = new HashSet<>();
  HashMap<String, Boolean> map = new HashMap<>();

  public boolean wordBreak(String s, List<String> wordDict) {

    set.addAll(wordDict);

    return helper(s);
  }


  public boolean helper(String s) {

    if (s.isEmpty())
      return true;

    if (map.containsKey(s))
      return map.get(s);

    for (int i = 0; i <= s.length(); i++) {
      String sub = s.substring(0, i);
      if (set.contains(sub)) {
        if (helper(s.substring(i, s.length())))
          return true;
      }
    }

    map.put(s, false);

    return false;

  }
}
