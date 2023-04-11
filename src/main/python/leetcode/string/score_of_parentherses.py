class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        
        paren = list(s)

        i = 0
        stack = []
        total_score = 0
        while i<len(s):
            if paren[i] == '(':
                stack.append('(')
            elif paren[i] == ')':
                if stack[-1] == '(':
                    stack.pop()
                    stack.append(1)
                else:
                    tmp_total = 0;
                    while stack[-1] != '(':
                        tmp_total = tmp_total + stack.pop()
                    stack.pop()
                    stack.append(tmp_total * 2)
                    
            i = i + 1
        
        while stack:
            total_score = total_score + stack.pop()

        return total_score
