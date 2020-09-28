package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
  public int minDepth(TreeNode root) {
    if (root == null)
      return 0;

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    int level = 1;
    int ret = 1;
    while (!q.isEmpty()) {
      int size = q.size();

      for (int i = 0; i < size; i++) {
        TreeNode n = q.poll();

        if (n.left == null && n.right == null) {
          return level;
        }
        if (n.left != null) {
          q.offer(n.left);
        }

        if (n.right != null) {
          q.offer(n.right);
        }
      }

      level++;
    }
    return ret;
  }
}
