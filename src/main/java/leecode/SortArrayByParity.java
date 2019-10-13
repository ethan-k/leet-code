package leecode;

import java.util.LinkedList;

public class SortArrayByParity {
  public int[] sortArrayByParity(int[] A) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i : A) {
      if (i % 2 == 0) {
        linkedList.addFirst(i);
      } else {
        linkedList.addLast(i);
      }
    }
    return linkedList.stream().mapToInt(value -> value).toArray();
  }
}
