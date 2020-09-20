package leetcode.tree;

import java.util.TreeSet;

class Node {
  public int val;
  public Node left;
  public Node right;
  public Node parent;
};

public class InorderSuccessorInBSTTwo {
  TreeSet<Node> set = new TreeSet<>((a, b) -> a.val - b.val);

  public Node inorderSuccessor(Node node) {
    Node root = node;

    while (root.parent != null) {
      root = root.parent;
    }
    traverse(root);
    return set.higher(node);
  }

  public void traverse(Node node) {
    if (node == null)
      return;

    set.add(node);
    traverse(node.left);
    traverse(node.right);
  }
}
