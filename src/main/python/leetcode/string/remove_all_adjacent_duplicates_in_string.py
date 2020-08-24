class Solution:
    def removeDuplicates(self, S: str) -> str:

        stack = []

        for x in S:
            if len(stack) != 0 and x == stack[-1]:
                stack.pop()
            else:
                stack.append(x)
        return ''.join(stack)