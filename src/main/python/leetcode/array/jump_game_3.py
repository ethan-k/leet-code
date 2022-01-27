from typings import List, Set

class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:

        return self.canReachInternal(arr, set(), start)


    def canReachInternal(self, arr: List[int], visited: Set[int], start: int) -> bool:

        if start < 0 or start >= len(arr) or (start in visited):
            return False

        if arr[start] == 0:
            return True

        visited.add(start)

        return self.canReachInternal(arr, visited, start+arr[start]) or self.canReachInternal(arr, visited, start-arr[start])