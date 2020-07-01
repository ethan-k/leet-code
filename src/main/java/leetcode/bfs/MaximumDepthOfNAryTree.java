package leetcode.bfs;


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
}

class Pair {
  public Node node;
  int depth;

  public Pair(Node node, int depth) {
    this.node = node;
    this.depth = depth;
  }
}

public class MaximumDepthOfNAryTree {
  public static void main(String[] args) {

  }

  public int maxDepth(Node root) {
    if (root == null) return 0;
    int depth = 1;

    Queue<Pair> queue = new LinkedList<>();

    queue.add(new Pair(root, 1));
    while (!queue.isEmpty()) {
      Pair poll = queue.poll();
      if (!poll.node.children.isEmpty()) {
        for (Node child : poll.node.children) {
          queue.add(new Pair(child, poll.depth + 1));
          depth = poll.depth + 1;
        }
      }
    }


    return depth;
  }
}
