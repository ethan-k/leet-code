package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversalOfABinaryTree {
  List<List<Integer>> ret = new ArrayList<>();
  TreeMap<Integer, TreeMap<Integer, List<Integer>>> levels = new TreeMap<>();

  public List<List<Integer>> verticalTraversal(TreeNode root) {

    verticalTraversal(root, 0, 0);

    for (TreeMap<Integer, List<Integer>> level : levels.values()) {
      List<Integer> newLevel = new ArrayList<>();

      for (List<Integer> tmp : level.values()) {
        Collections.sort(tmp);
        newLevel.addAll(tmp);
      }
      ret.add(newLevel);
    }

    return ret;
  }

  public void verticalTraversal(TreeNode root, int vertical, int horizontal) {
    if (root == null)
      return;

    if (!levels.containsKey(vertical)) {
      levels.put(vertical, new TreeMap<>());
    }

    if (!levels.get(vertical).containsKey(horizontal)) {
      levels.get(vertical).put(horizontal, new ArrayList<>());
    }

    levels.get(vertical).get(horizontal).add(root.val);
    verticalTraversal(root.left, vertical - 1, horizontal + 1);
    verticalTraversal(root.right, vertical + 1, horizontal + 1);
  }
}
