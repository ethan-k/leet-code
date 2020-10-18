package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
  public List<String> findRepeatedDnaSequences(String s) {

    HashMap<String, Integer> counts = new HashMap<>();

    int left = 0, right = 0;

    while (right < s.length()) {

      if ((right - left + 1) == 10) {
        String sub = s.substring(left, right + 1);
        counts.put(sub, counts.getOrDefault(sub, 0) + 1);
        left++;
      }
      right++;
    }

    List<String> list = new ArrayList<>();

    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
      if (entry.getValue() > 1) {
        list.add(entry.getKey());
      }
    }

    return list;
  }
}
