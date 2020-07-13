package leetcode.tree;

import java.util.*;

class LowestCommonAncestorOfABinaryTree {
  Map<TreeNode, TreeNode> childParent = new HashMap<>();
  Set<TreeNode> visited = new HashSet<>();

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    traverse(root, null);

    while (p != null && q != null) {

      if (p == q)
        return p;

      if (visited.contains(p)) {
        return p;
      } else if (visited.contains(q)) {
        return q;
      }

      visited.add(p);
      visited.add(q);

      p = childParent.get(p);
      q = childParent.get(q);
    }

    while (p != null) {
      if (visited.contains(p)) {
        return p;
      }

      visited.add(p);
      p = childParent.get(p);
    }

    while (q != null) {
      if (visited.contains(q)) {
        return q;
      }
      visited.add(q);
      q = childParent.get(q);
    }

    return null;
  }

  void traverse(TreeNode cur, TreeNode parent) {

    if (cur == null)
      return;

    childParent.put(cur, parent);
    traverse(cur.left, cur);
    traverse(cur.right, cur);
  }
}