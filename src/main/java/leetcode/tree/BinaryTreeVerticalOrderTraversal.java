package leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeVerticalOrderTraversal {
  public List<List<Integer>> verticalOrder(TreeNode root) {

      List<List<Integer>> ret = new ArrayList<>();
      if (root == null)
        return ret;

      Map<TreeNode, Integer> vertical = new HashMap<>();
      TreeMap<Integer, List<Integer>> order = new TreeMap<>();

      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      vertical.put(root, 0);

      while (!q.isEmpty()) {
        TreeNode n = q.poll();
        Integer parent = vertical.get(n);

        order.putIfAbsent(parent, new ArrayList<>());
        order.get(parent).add(n.val);

        if (n.left != null) {
          q.offer(n.left);
          vertical.put(n.left, parent - 1);
        }

        if (n.right != null) {
          q.offer(n.right);
          vertical.put(n.right, parent + 1);
        }
      }

      ret.addAll(order.values());
      return ret;
  }
}
