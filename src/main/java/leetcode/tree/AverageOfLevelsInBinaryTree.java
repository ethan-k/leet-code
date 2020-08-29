package leetcode.tree;

import java.util.*;

public class AverageOfLevelsInBinaryTree {
  public List<Double> averageOfLevels(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    List<Double> ret = new ArrayList<>();

    while (!queue.isEmpty()) {
      int count = queue.size();
      double total = 0;
      for (int i = 0; i < count; i++) {
        TreeNode n = queue.poll();
        total += n.val;
        if (n.left != null) {
          queue.offer(n.left);
        }
        if (n.right != null) {
          queue.offer(n.right);
        }

      }
      ret.add(total / count);
    }
    return ret;
  }
}
