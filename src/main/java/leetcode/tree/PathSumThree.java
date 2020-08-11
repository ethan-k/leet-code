package leetcode.tree;

import java.util.*;

public class PathSumThree {
  int target;
  int count = 0;
  Map<Integer, Integer> counting = new HashMap<>();

  public int pathSum(TreeNode root, int sum) {
    this.target = sum;
    traverse(root, 0);
    return count;
  }

  public void traverse(TreeNode root, int sum) {
    if (root == null)
      return;

    sum += root.val;

    if (sum == this.target)
      count++;

    if (counting.containsKey(sum - target))
      count += counting.get(sum - target);

    counting.put(sum, counting.getOrDefault(sum, 0) + 1);

    traverse(root.left, sum);
    traverse(root.right, sum);

    counting.put(sum, counting.get(sum) - 1);
  }
}
