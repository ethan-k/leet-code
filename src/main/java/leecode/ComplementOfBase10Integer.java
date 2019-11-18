package leecode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ComplementOfBase10Integer {

  public static void main(String[] args) {
    System.out.println(new ComplementOfBase10Integer().bitwiseComplement(0));
  }

  public int bitwiseComplement(int N) {
    if (N == 0) {
      return 1;
    }
    Queue<Integer> queue = new LinkedList<>();
    while (N != 0) {
      queue.offer(N % 2);
      N = N / 2;
    }
    int i = 0;
    int res = 0;
    while (!queue.isEmpty()) {
      Integer pop = queue.poll();
      if (pop == 0) {
        res += Math.pow(2, i);
      }
      i++;
    }
    return res;
  }
}
