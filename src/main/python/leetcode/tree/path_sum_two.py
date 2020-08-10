from .models import TreeNode
from typings import List

class Solution:

    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        self.target = sum
        self.ret = []
        self.traverse(root, [], 0)
        return self.ret


    def traverse(self, node: TreeNode, l: List[int], cur_sum: int):
        if node is None:
            return

        l.append(node.val)

        if node.left is None and node.right is None and (node.val + cur_sum == self.target):
            self.ret.append(l.copy())
        else:
            self.traverse(node.left, l, cur_sum + node.val)
            self.traverse(node.right, l, cur_sum + node.val)

        l.pop()