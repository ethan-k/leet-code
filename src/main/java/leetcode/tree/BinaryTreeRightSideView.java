package leetcode.tree;

public class BinaryTreeRightSideView {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ret = new ArrayList<>();

    if (root == null)
      return ret;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      int right = 0;
      for (int i = 0; i < size; i++) {
        TreeNode n = queue.poll();
        right = n.val;
        if (n.left != null) {
          queue.offer(n.left);
        }
        if (n.right != null) {
          queue.offer(n.right);
        }
      }
      ret.add(right);

    }
    return ret;
  }
}
