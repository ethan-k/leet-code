package leetcode.greedy;

public class MaximizeSumOfArrayAfterKNegations {
  public static void main(String[] args) {
    int[] input1 = new int[]{4, 2, 3};
    int k1 = 1;
    int[] input2 = new int[]{3, -1, 0, 2};
    int k2 = 3;
    int[] input3 = new int[]{2, -3, -1, 5, -4};
    int k3 = 2;
    System.out.println(largestSumAfterKNegations(input1, k1));
    System.out.println(largestSumAfterKNegations(input2, k2));
    System.out.println(largestSumAfterKNegations(input3, k3));
  }

  public static int largestSumAfterKNegations(int[] A, int K) {

    int sum = 0;
    int i;
    while (K > 0) {
      i = 0;
      int idxOfSmallestNumber = 0;
      while (i < A.length) {
        if (A[i] < A[idxOfSmallestNumber]) {
          idxOfSmallestNumber = i;
        }
        i++;
      }
      A[idxOfSmallestNumber] = -A[idxOfSmallestNumber];
      K--;
    }
    for (int i1 : A) {
      sum += i1;
    }

    return sum;
  }
}
