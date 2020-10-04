package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupShiftedStrings {
  public List<List<String>> groupStrings(String[] strings) {

    HashMap<String, List<String>> map = new HashMap<>();
    for (String string : strings) {
      int offset = string.charAt(0) - 'a';

      char[] chars = string.toCharArray();

      for (int i = 0; i < chars.length; i++) {
        int diff = chars[i] - 'a' - offset;
        if (diff < 0)
          diff = diff + 26;

        chars[i] = (char) ('a' + diff);
      }

      String key = new String(chars);

      if (!map.containsKey(key))
        map.put(key, new ArrayList<>());

      map.get(key).add(string);
    }

    return new ArrayList<>(map.values());
  }
}
