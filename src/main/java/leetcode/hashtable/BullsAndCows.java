package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

class BullsAndCows {
  public String getHint(String secret, String guess) {

    int bull = 0;
    int cow = 0;

    boolean[] bulls = new boolean[secret.length()];

    for (int i = 0; i < secret.length(); i++) {
      if (secret.charAt(i) == guess.charAt(i)) {
        bulls[i] = true;
        bull++;
      }
    }

    Map<Character, Integer> secCount = new HashMap<>();
    Map<Character, Integer> guessCount = new HashMap<>();

    for (int i = 0; i < secret.length(); i++) {
      if (!bulls[i]) {
        secCount.put(secret.charAt(i), secCount.getOrDefault(secret.charAt(i), 0) + 1);
      }
    }

    for (int i = 0; i < guess.length(); i++) {
      if (!bulls[i] && secCount.containsKey(guess.charAt(i))) {
        if (secCount.get(guess.charAt(i)) > 0) {
          cow++;
          secCount.put(guess.charAt(i), secCount.get(guess.charAt(i)) - 1);
        }
      }
    }

    return bull + "A" + cow + "B";
  }
}