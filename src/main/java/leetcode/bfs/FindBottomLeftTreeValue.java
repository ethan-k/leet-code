package leetcode.bfs;


import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    TreeNode n1 = new TreeNode(2);
    TreeNode n2 = new TreeNode(1);
    TreeNode n3 = new TreeNode(3);
    n1.left = n2;
    n1.right = n3;

    System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(n1));

  }

  public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> mainQueue = new LinkedList<>();
    mainQueue.offer(root);
    TreeNode leftMost = root;
    while (!mainQueue.isEmpty()) {
      int size = mainQueue.size();
      for (int i = 0; i < size; i++) {
        TreeNode n = mainQueue.poll();
        if (i == 0) {
          leftMost = n;
        }
        if (n.left != null) {
          mainQueue.offer(n.left);
        }
        if (n.right != null) {
          mainQueue.offer(n.right);
        }
      }
    }

    return leftMost.val;
  }
}
