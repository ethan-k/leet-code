package leetcode.dfs;

import leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheLonelyNodes {
  List<Integer> ret = new ArrayList<>();

  public List<Integer> getLonelyNodes(TreeNode root) {

    helper(root, true);

    return ret;
  }

  void helper(TreeNode root, boolean hasSiblings) {
    if (root == null)
      return;

    if (!hasSiblings) {
      ret.add(root.val);
    }

    if (root.right == null) {
      helper(root.left, false);
    } else if (root.left == null) {
      helper(root.right, false);
    } else {
      helper(root.left, true);
      helper(root.right, true);
    }
  }
}
