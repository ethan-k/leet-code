package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }
};

public class NArrayTreeLevelTraversal {

  public static void main(String[] args) {

  }

  List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> levelOrder(Node root) {

    if (root != null) {
      List<Integer> list = new ArrayList<>();
      list.add(root.val);
      result.add(list);
      Queue<Node> nodes = new LinkedList<>(root.children);
      bfs(nodes);
    }


    return result;
  }

  public void bfs(Queue<Node> nodes) {
    if (nodes.isEmpty()) return;
    List<Integer> list = new ArrayList<>();
    Queue<Node> nextNodes = new LinkedList<>();
    while (!nodes.isEmpty()) {
      Node poll = nodes.poll();
      list.add(poll.val);
      nextNodes.addAll(poll.children);
    }
    result.add(list);
    bfs(nextNodes);
  }

}

