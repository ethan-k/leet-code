

class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:

        q = [root]
        ret = 0
        while len(q) != 0:
            size = len(q)
            ret = 0
            for _ in range(0, size):
                n = q.pop(0)
                ret = ret + n.val

                if n.left is not None:
                    q.append(n.left)
                if n.right is not None:
                    q.append(n.right)

        return ret
