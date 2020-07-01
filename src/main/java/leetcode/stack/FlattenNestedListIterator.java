package leetcode.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


interface NestedInteger {

  // @return true if this NestedInteger holds a single integer, rather than a nested list.
  public boolean isInteger();

  // @return the single integer that this NestedInteger holds, if it holds a single integer
  // Return null if this NestedInteger holds a nested list
  public Integer getInteger();

  // @return the nested list that this NestedInteger holds, if it holds a nested list
  // Return null if this NestedInteger holds a single integer
  public List<NestedInteger> getList();
}

public class FlattenNestedListIterator implements Iterator<Integer> {
  Queue<Integer> queue;

  public FlattenNestedListIterator(List<NestedInteger> nestedList) {
    queue = new LinkedList<>();
    this.helper(nestedList);
  }

  private void helper(List<NestedInteger> nestedList) {
    for (NestedInteger i : nestedList) {
      if (i.isInteger()) {
        queue.offer(i.getInteger());
      } else {
        helper(i.getList());
      }
    }
  }

  public Integer next() {

    return queue.poll();
  }

  public boolean hasNext() {
    return !queue.isEmpty();
  }
}
