package leetcode.dfs;

import java.util.*;

class Node {
  public int val;
  public List<Node> neighbors;

  public Node() {
    val = 0;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val, ArrayList<Node> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}

public class CloneGraph {
  HashMap<Node, Node> mapping = new HashMap<>();
  public Node cloneGraph(Node node) {

    if (node == null)
      return null;

    if (mapping.containsKey(node)) {
      return mapping.get(node);
    }

    Node n = new Node(node.val);
    List<Node> neighbors = new ArrayList<>();
    n.neighbors = neighbors;
    mapping.put(node, n);

    for(Node c : node.neighbors) {
      Node cloned = cloneGraph(c);
      neighbors.add(cloned);
    }

    return n;

  }
}
