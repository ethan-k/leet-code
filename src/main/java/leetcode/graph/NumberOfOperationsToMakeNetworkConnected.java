package leetcode.graph;

import java.util.*;

public class NumberOfOperationsToMakeNetworkConnected {
    public int makeConnected(int n, int[][] connections) {

        int numOfCables = connections.length;
        if (numOfCables < n-1) {
            return -1;
        }

        Map<Integer, List<Integer>> graph = buildGraph(n, connections);

        int count = 0;

        Set<Integer> visited = new HashSet<>();

        for(int i=0; i<n; i++) {
            if (connectedComputers(graph, i, visited)) {
                count++;
            }
        }

        return count-1;

    }


    Map<Integer, List<Integer>> buildGraph(int n, int[][] connections) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] connection: connections) {
            int computer1 = connection[0];
            int computer2 = connection[1];

            if (!graph.containsKey(computer1)) {
                graph.put(computer1, new ArrayList<>());
            }
            if (!graph.containsKey(computer2)) {
                graph.put(computer2, new ArrayList<>());
            }

            graph.get(computer1).add(computer2);
            graph.get(computer2).add(computer1);
        }

        return graph;
    }



    boolean connectedComputers(Map<Integer, List<Integer>> graph, int current, Set<Integer> visited) {
        if (visited.contains(current))
            return false;

        visited.add(current);

        if (graph.containsKey(current)) {
            for(int computer: graph.get(current)) {
                connectedComputers(graph, computer, visited);
            }
        }

        return true;

    }
}
