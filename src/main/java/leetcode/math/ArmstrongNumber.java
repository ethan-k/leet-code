package leetcode.math;

public class ArmstrongNumber {
  public boolean isArmstrong(int N) {
    String n = String.valueOf(N);
    int k = n.length();

    double total = 0;

    for (int i = 0; i < k; i++) {
      total += Math.pow(n.charAt(i) - '0', k);
    }

    return (int) total == N;
  }
}
