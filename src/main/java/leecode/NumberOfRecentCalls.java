package leecode;

import java.util.*;

public class NumberOfRecentCalls {
  public static void main(String[] args) {

  }


  class RecentCounter {

    LinkedList<Integer> linkedList = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
      linkedList.add(t);
      ListIterator<Integer> integerListIterator = linkedList.listIterator(linkedList.size());

      int count = 0;
      while (integerListIterator.hasPrevious()) {
        if (integerListIterator.previous() >= t - 3000) {
          count++;
        } else {
          break;
        }
      }
      return count;
    }

  }
}
