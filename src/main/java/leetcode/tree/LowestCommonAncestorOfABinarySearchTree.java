package leetcode.tree;

import java.util.HashMap;
import java.util.HashSet;

public class LowestCommonAncestorOfABinarySearchTree {
  HashMap<TreeNode, TreeNode> relationship = new HashMap<>();

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    traverse(root, null);

    HashSet<TreeNode> seen = new HashSet<>();
    while (p != null && q != null) {

      if (p == q)
        return p;

      if (p == relationship.get(q)) {
        return p;
      }

      if (q == relationship.get(p)) {
        return q;
      }

      if (relationship.get(p) == relationship.get(q)) {
        return relationship.get(p);
      }


      seen.add(p);
      seen.add(q);
      p = relationship.get(p);
      q = relationship.get(q);
    }

    while (p != null) {
      if (seen.contains(p)) {
        return p;
      }
      p = relationship.get(p);
    }

    while (q != null) {
      if (seen.contains(q)) {
        return q;
      }
      q = relationship.get(q);
    }

    return null;

  }

  public void traverse(TreeNode node, TreeNode parent) {
    if (node == null)
      return;

    relationship.put(node, parent);

    traverse(node.left, node);
    traverse(node.right, node);
  }
}
