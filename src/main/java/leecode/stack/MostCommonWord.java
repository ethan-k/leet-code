package leecode.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
  public String mostCommonWord(String paragraph, String[] banned) {
    Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> wordCount = new HashMap<>();

    StringBuilder builder = new StringBuilder();
    for (char c : paragraph.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        builder.append(Character.toLowerCase(c));
      } else {
        builder.append(" ");
      }
    }
    paragraph = builder.toString();
    String[] arr = paragraph.split(" ");
    for (String word : arr) {
      if (!bannedSet.contains(word) && !word.equals("")) {
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
      }
    }


    int max = Integer.MIN_VALUE;
    String ret = "";

    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
      if (entry.getValue() > max) {
        ret = entry.getKey();
        max = entry.getValue();
      }
    }

    return ret;
  }
}
