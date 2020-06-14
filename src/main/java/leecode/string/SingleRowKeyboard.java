package leecode.string;

public class SingleRowKeyboard {
  public int calculateTime(String keyboard, String word) {
    int[] map = new int[keyboard.length()];

    for (int i = 0; i < keyboard.length(); i++) {
      map[keyboard.charAt(i) - 'a'] = i;
    }
    int total = 0;
    for (int i = 0; i < word.length(); i++) {
      if (i == 0) {
        total += map[word.charAt(i) - 'a'];
      } else {
        total += Math.abs(map[word.charAt(i) - 'a'] - map[word.charAt(i - 1) - 'a']);
      }

    }
    return total;
  }
}
