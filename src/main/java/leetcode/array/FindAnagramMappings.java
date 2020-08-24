package leetcode.array;

import java.util.*;

public class FindAnagramMappings {
  public int[] anagramMappings(int[] A, int[] B) {


    Map<Integer, Integer> mapping = new HashMap<>();

    for (int i = 0; i < B.length; i++) {
      mapping.put(B[i], i);
    }

    int[] ret = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      ret[i] = mapping.get(A[i]);
    }

    return ret;
  }
}
