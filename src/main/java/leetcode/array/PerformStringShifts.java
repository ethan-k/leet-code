package leetcode.array;

public class PerformStringShifts {
  public String stringShift(String s, int[][] shifts) {
    int right = 0;
    int n = s.length();
    for (int[] shift : shifts) {

      int moves = shift[1];
      if (shift[0] == 0) {
        right -= moves;
      } else {
        right += moves;
      }
    }

    right = right % s.length();
    char[] chars = s.toCharArray();
    char[] ret = new char[chars.length];

    for (int i = 0; i < chars.length; i++) {
      int possible = i + right;
      if (possible < 0)
        possible = possible + n;
      else {
        possible = possible % n;
      }
      ret[possible] = chars[i];
    }
    return new String(ret);
  }
}
