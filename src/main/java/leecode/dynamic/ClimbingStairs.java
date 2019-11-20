package leecode.dynamic;

public class ClimbingStairs {
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 2;
    }

    int[] output = new int[n];
    output[0] = 1;
    output[1] = 2;

    for (int i = 2; i < n; i++) {
      output[i] = output[i - 2] + output[i - 1];
    }
    return output[output.length - 1];
  }
}
