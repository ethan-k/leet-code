package leetcode.binarysearch;


import java.util.ArrayList;
import java.util.List;

interface ArrayReader {
  int get(int index);
}

public class SearcInASortedArrayOfUnknownSize {
  public int search(ArrayReader reader, int target) {
    List<Integer> list = new ArrayList<>();

    int right = 0;
    while (reader.get(right) != 2147483647) {
      list.add(reader.get(right++));
    }

    int left = 0;
    right = right - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (list.get(middle) == target)
        return middle;
      else if (list.get(middle) < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    return -1;
  }
}
