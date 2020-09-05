class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class RecursiveSolution:

    def findMiddleElement(self, head: ListNode) -> TreeNode:

        prev = None
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        if prev is not None:
            prev.next = None

        return slow

    def sortedListToBST(self, head: ListNode) -> TreeNode:
        if head is None:
            return None

        middle = self.findMiddleElement(head)

        node = TreeNode(middle.val)

        if head == middle:
            return node

        node.left = self.sortedListToBST(head)
        node.right = self.sortedListToBST(middle.next)

        return node

# class IterativeSolution:
# 	def sortedListToBST(self, head: ListNode) -> TreeNode:
