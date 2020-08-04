class Solution:
    def isPalindrome(self, s: str) -> bool:

        left = 0
        right = len(s)-1

        while left <= right:
            if s[left].isdigit() == False and s[left].isalpha() == False:
                left = left+1
            elif s[right].isdigit() == False and s[right].isalpha() == False:
                right = right - 1
            else:
                if s[right].lower() != s[left].lower():
                    return False
                left = left + 1
                right = right - 1

        return True
