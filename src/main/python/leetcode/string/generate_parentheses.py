class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        output = []
        self.generate(n, n, "", output)
        return output


    def generate(self, left: int, right: int, cur: str, output: List[str]):
        
        
        if left == 0 and right == 0: 
            output.append(cur)
            return 
        
        if left > 0: 
            self.generate(left - 1, right, cur + "(", output)
        if left < right: 
            self.generate(left, right-1, cur + ")", output)
            