package leetcode.tree;

import java.util.*;

public class PathSumTwo {
  List<List<Integer>> ret = new ArrayList<>();
  int target;

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    this.target = sum;
    traverse(root, new ArrayList<>(), 0);
    return ret;
  }

  void traverse(TreeNode root, List<Integer> list, int curSum) {

    if (root == null) {
      return;
    }

    list.add(root.val);

    if (root.left == null && root.right == null && root.val + curSum == this.target) {
      ret.add(list);
    }

    traverse(root.left, new ArrayList(list), curSum + root.val);
    traverse(root.right, new ArrayList(list), curSum + root.val);

  }
}
