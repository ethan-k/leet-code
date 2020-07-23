class Solution:
    def isValid(self, s: str) -> bool:
        mappings = {
            "(": ")",
            "[": "]",
            "{": "}"
        }

        stack = []

        for ch in s:
            if ch in mappings:
                stack.append(ch)
            else:

                if len(stack) == 0:
                    return False

                top = stack.pop();

                if mappings[top] != ch:
                    return False

        return len(stack) == 0
