package main.java.leetcode.tree;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Stack;

import leetcode.model.TreeNode;

public class BinaryTreeInorderTraveral {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }

      root = stack.pop();
      ret.add(root.val);

      root = root.right;
    }

    return ret;
  }

}