package leetcode.string;

public class ConsecutiveCharacters {
  public int maxPower(String s) {
    int max = 0;
    char c = '#';

    int length = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        length++;
      } else {
        max = Math.max(length, max);
        length = 1;
        c = s.charAt(i);
      }
    }
    max = Math.max(length, max);
    return max;
  }
}
