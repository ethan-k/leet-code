package leetcode.array;

public class FindNUniqueIntegersSumUpToZero {
  public int[] sumZero(int n) {
    int[] ret = new int[n];
    int start = 0;
    if (n == 1) {
      return new int[]{0};
    }
    if (n % 2 != 0) {
      ret[0] = 0;
      start = 1;
    }
    int num = 1;
    for (int i = 0; i < ret.length / 2; i++) {
      ret[i + start] = num;
      ret[ret.length - i - 1] = num * -1;
      num++;
    }
    return ret;
  }
}
