package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class ReorganizeString {
  HashMap<Character, Integer> map = new HashMap<>();

  public String reorganizeString(String S) {
    int l = S.length();
    for (int i = 0; i < S.length(); i++) {
      map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
    }

    StringBuilder sb = new StringBuilder();
    sb.append(findUnused('#'));
    for (int i = 0; i < l - 1; i++) {
      Character ch = findUnused(sb.charAt(sb.length() - 1));
      if (ch == ' ')
        return "";
      sb.append(ch);
    }

    return sb.toString();
  }

  public Character findUnused(Character prev) {
    if (map.size() == 0)
      return ' ';

    Character cand = ' ';
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getKey() != prev) {
        if (cand == ' ') {
          cand = entry.getKey();
        } else {
          if (entry.getValue() > map.get(cand)) {
            cand = entry.getKey();
          }
        }
      }
    }

    if (cand == ' ')
      return ' ';

    map.put(cand, map.get(cand) - 1);
    if (map.get(cand) == 0)
      map.remove(cand);

    return cand;
  }
}
