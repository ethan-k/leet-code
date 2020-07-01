package leetcode;

public class ToLowerCase {
  public String toLowerCase(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; i++ ) {
      char currentCh = chars[i];

      if (currentCh <= 'Z' && currentCh >= 'A' ) {
        chars[i] = (char) (chars[i] + (char) ('a' - 'A'));
      }
    }
    return new String(chars);
  }

  public static void main(String[] args) {

  }
}
