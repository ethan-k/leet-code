package leecode.tree;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class CousinsInBinaryTree {
  Map<Integer, Integer> depthCounter = new HashMap<>();
  Map<Integer, Integer> parentTracker = new HashMap<>();

  public boolean isCousins(TreeNode root, int x, int y) {
    depth(root, null, 0);
    return depthCounter.get(x) == depthCounter.get(y) && parentTracker.get(x) != parentTracker.get(y);
  }

  void depth(TreeNode node, TreeNode parent, int depth) {
    if (node == null)
      return;
    depthCounter.put(node.val, depth);
    if (parent != null)
      parentTracker.put(node.val, parent.val);

    depth(node.left, node, depth + 1);
    depth(node.right, node, depth + 1);
  }
}
