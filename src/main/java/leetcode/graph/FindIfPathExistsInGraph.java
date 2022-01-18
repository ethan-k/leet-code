package leetcode.graph;

import java.util.*;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] edge: edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            if(!graph.containsKey(v1))
                graph.put(v1, new ArrayList<>());
            if (!graph.containsKey(v2))
                graph.put(v2, new ArrayList<>());

            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        Set<Integer> seen = new HashSet<>();
        while(!stack.isEmpty()) {
            int v = stack.pop();
            seen.add(v);
            if (v == destination)
                return true;

            for(int vtx: graph.get(v)) {
                if (!seen.contains(vtx)) {
                    stack.push(vtx);
                }
            }
        }

        return false;
    }
}
