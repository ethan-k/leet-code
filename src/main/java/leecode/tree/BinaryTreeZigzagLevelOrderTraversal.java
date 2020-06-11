package leecode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {

  List<List<Integer>> ret = new ArrayList<>();

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    if (root == null)
      return ret;
    Stack<TreeNode> container = new Stack<>();
    container.add(root);

    helper(true, container);
    return ret;
  }

  void helper(boolean left, Stack<TreeNode> list) {

    if (list.isEmpty()) {
      return;
    }
    Stack<TreeNode> next = new Stack<>();
    List<Integer> curLayer = new ArrayList<>();

    while (!list.isEmpty()) {
      TreeNode n = list.pop();
      curLayer.add(n.val);
      if (left) {
        if (n.left != null) {
          next.push(n.left);
        }
        if (n.right != null) {
          next.push(n.right);
        }
      } else {
        if (n.right != null) {
          next.push(n.right);
        }
        if (n.left != null) {
          next.push(n.left);
        }
      }
    }

    ret.add(curLayer);

    helper(!left, next);
  }

}
