package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
  Map<Integer,Integer> memo = new HashMap<>();

  public static void main(String[] args) {
    System.out.println(new FibonacciNumber().fib(4));
  }
  public int fib(int N) {
    if (N == 0) {
      return 0;
    }
    if (N == 1) {
      return 1;
    }
    int a = 0;
    int b = 1;
    int c = a + b;
    for (int i = 2; i <= N; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
  }
}
