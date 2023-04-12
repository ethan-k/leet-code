class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        ans = 0
        
        left = 0; right = 0
        seen = set()
        
        while(right < len(s)):
            if s[right] not in seen:
                seen.add(s[right])
                right = right + 1
            else: 
                seen.remove(s[left])
                left = left + 1
            ans = max(ans, right - left)
                    
        return ans
        