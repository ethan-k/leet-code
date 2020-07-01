package leetcode;


import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {

  class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

  public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<>();
    helper(root, result);
    return result;
  }

  public void helper(Node node, List<Integer> list) {
    if (node == null) {
      return;
    }
    if (!node.children.isEmpty()) {
      for (Node child : node.children) {
        helper(child, list);
      }
    }
    list.add(node.val);
  }
}
