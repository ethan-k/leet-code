package leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SmallestSubtreeWithAllTheDeppestNodes {
  HashMap<TreeNode, TreeNode> parent = new HashMap<>();
  HashMap<Integer, List<TreeNode>> siblingsByLevel = new HashMap<>();

  public TreeNode subtreeWithAllDeepest(TreeNode root) {

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    parent.put(root, null);
    int level = 0;
    while(!q.isEmpty()) {
      int size = q.size();

      List<TreeNode> siblings = new ArrayList<>();

      for(int i=0; i<size; i++) {
        TreeNode n = q.poll();
        siblings.add(n);
        if (n.left != null) {
          q.offer(n.left);
          parent.put(n.left, n);
        }

        if (n.right != null) {
          q.offer(n.right);
          parent.put(n.right, n);
        }
      }
      siblingsByLevel.put(level, siblings);
      level++;
    }

    List<TreeNode> deepestNodes = siblingsByLevel.get(level-1);
    if (deepestNodes.size() == 1)
      return deepestNodes.get(0);


    TreeNode[] tracks = deepestNodes.toArray(new TreeNode[0]);

    while(tracks[0] != null) {
      boolean found = true;
      for(int i=0; i<tracks.length-1; i++) {
        if (tracks[i] != tracks[i+1]) {
          found = false;
          break;
        }
      }
      if (found)
        return tracks[0];

      for(int i=0; i<tracks.length; i++) {
        tracks[i] = parent.get(tracks[i]);
      }
    }
    return root;

  }
}
