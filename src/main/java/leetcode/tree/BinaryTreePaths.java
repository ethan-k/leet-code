package leetcode.tree;

import java.util.*;

public class BinaryTreePaths {
  List<String> ret = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> cur = new ArrayList<>();

    traverse(root, new ArrayList<>());
    return ret;
  }

  void traverse(TreeNode n, List<String> list) {

    if (n == null) {
      return;
    }

    list.add(String.valueOf(n.val));

    if (n.left == null && n.right == null) {
      ret.add(String.join("->", list));
    }


    traverse(n.left, new ArrayList<>(list));
    traverse(n.right, new ArrayList<>(list));

  }
}
