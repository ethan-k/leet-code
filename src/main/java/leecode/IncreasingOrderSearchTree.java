package leecode;

import leecode.model.TreeNode;

import java.util.LinkedList;
import java.util.TreeSet;

public class IncreasingOrderSearchTree {

  LinkedList<Integer> treeSet = new LinkedList<>();
  public TreeNode increasingBST(TreeNode root) {
    BSTHealper(root);
    TreeNode result = new TreeNode(treeSet.pollFirst());
    TreeNode prev = result;
    while (!treeSet.isEmpty()) {
      TreeNode cur = new TreeNode(treeSet.pollFirst());
      prev.right = cur;
      prev = cur;
    }
    return result;
  }

  public void BSTHealper(TreeNode note) {
    if (note == null) {
      return;
    }
    BSTHealper(note.left);
    treeSet.add(note.val);
    BSTHealper(note.right);
  }

}
