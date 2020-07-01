package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr2.length; ++i) {
      map.put(arr2[i], i);
    }

    return Arrays.stream(arr1).
        boxed().
        sorted((a, b) -> {
          Integer x = map.get(a);
          Integer y = map.get(b);
          if (x != null && y != null)
            return x.compareTo(y);
          if (x != null)
            return -1;
          if (y != null)
            return 1;
          return a.compareTo(b);
        })
        .mapToInt(i -> i).
            toArray();
  }
}
