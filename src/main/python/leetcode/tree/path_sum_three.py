class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> int:
        self.target = sum
        self.count = 0
        self.h = {}
        self.traverse(root, 0)
        return self.count

    def traverse(self, root: TreeNode, sum: int):
        if root is None:
            return

        sum += root.val
        if sum == self.target:
            self.count = self.count + 1

        if sum not in self.h:
            self.h[sum] = 0
    
        if (sum - self.target) in self.h:
            self.count += self.h[sum - self.target]

        self.h[sum] = self.h[sum] + 1
        self.traverse(root.left, sum)
        self.traverse(root.right, sum)
        self.h[sum] = self.h[sum] - 1
