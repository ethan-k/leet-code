package leecode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

  public static void main(String[] args) {
    System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons("leetcode"));
  }

  public int maxNumberOfBalloons(String text) {

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
      map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
    }

    String ballown = "balloon";
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      boolean found = true;
      for (int j = 0; j < ballown.length(); j++) {
        Integer curCount = map.getOrDefault(ballown.charAt(j), 0);
        map.put(ballown.charAt(j), --curCount);
        if (curCount < 0) {
          found = false;
          break;
        }
      }
      if (found) {
        count++;
      }

    }
    return count;
  }
}
