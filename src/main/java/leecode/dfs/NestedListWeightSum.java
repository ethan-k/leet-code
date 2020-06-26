package leecode.dfs;

import java.util.List;

public class NestedListWeightSum {

  public interface NestedInteger {

    boolean isInteger();

    Integer getInteger();

    void setInteger(int value);

    void add(NestedInteger ni);

    List<NestedInteger> getList();
  }

  public int depthSum(List<NestedInteger> nestedList) {
    return depthSum(nestedList, 1);
  }

  int depthSum(List<NestedInteger> nestedList, int depth) {
    int total = 0;
    for (NestedInteger nested : nestedList) {
      if (nested.isInteger())
        total += nested.getInteger() * depth;
      else
        total += depthSum(nested.getList(), depth + 1);
    }
    return total;
  }
}
