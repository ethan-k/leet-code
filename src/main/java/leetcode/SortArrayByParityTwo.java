package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class SortArrayByParityTwo {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new SortArrayByParityTwo().sortArrayByParityII(new int[]{
        888, 505, 627, 846
    })));
  }

  public int[] sortArrayByParityII(int[] A) {

    Stack<Integer> oddNumber = new Stack<>();
    Stack<Integer> evenNumber = new Stack<>();
    for (int num : A) {
      if (num % 2 == 0) {
        evenNumber.push(num);
      } else {
        oddNumber.push(num);
      }
    }
    for (int i = 0; i < A.length; i++) {
      if (i % 2 == 0) {
        A[i] = evenNumber.pop();
      } else {
        A[i] = oddNumber.pop();
      }
    }
    return A;
  }
}
