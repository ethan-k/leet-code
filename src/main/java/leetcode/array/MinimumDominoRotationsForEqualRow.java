package leetcode.array;

public class MinimumDominoRotationsForEqualRow {
  public int minDominoRotations(int[] A, int[] B) {
    int[] counts = new int[7];

    for (int i = 0; i < A.length; i++) {
      counts[A[i]]++;
      counts[B[i]]++;
    }

    int mostCommonNumber = 1;
    for (int i = 2; i < counts.length; i++) {
      if (counts[mostCommonNumber] < counts[i]) {
        mostCommonNumber = i;
      }
    }


    for (int i = 0; i < A.length; i++) {
      if (A[i] != mostCommonNumber && B[i] != mostCommonNumber) {
        return -1;
      }
    }

    int aCount = 0;
    int bCount = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == mostCommonNumber) {
        aCount++;
      }
      if (B[i] == mostCommonNumber) {
        bCount++;
      }
    }

    if (aCount > bCount) {
      return A.length - aCount;
    } else {
      return A.length - bCount;
    }
  }
}
