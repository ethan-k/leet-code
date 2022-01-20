from typing import Dict, List


class Solution:
    def makeConnected(self, n: int, connections: List[List[int]]) -> int:

        numOfCables = len(connections)
        if numOfCables < (n - 1):
            return -1

        count = 0

        visited = set()

        graph = self.buildGraph(connections)

        for x in range(0, n):
            if self.connectedComputers(graph, x, visited):
                count = count + 1

        return count - 1

    def buildGraph(self, connections: List[List[int]]) -> Dict[int, List[int]]:
        graph = {}

        for connection in connections:
            com1 = connection[0]
            com2 = connection[1]

            if com1 not in graph:
                graph[com1] = []
            if com2 not in graph:
                graph[com2] = []

            graph[com1].append(com2)
            graph[com2].append(com1)

        return graph

    def connectedComputers(self, graph: Dict[int, List[int]], current: int, visited: set[int]) -> bool:
        if current in visited:
            return False

        visited.add(current)
        if current in graph:
            for x in graph[current]:
                self.connectedComputers(graph, x, visited)

        return True
