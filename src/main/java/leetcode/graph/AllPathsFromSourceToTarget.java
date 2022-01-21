package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget
{
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        int target = n - 1;
        traverse(0, target, new ArrayList<>(), graph);
        return output;
    }

    public void traverse(int cur, int target, List<Integer> paths, int[][] graph) {
        paths.add(cur);
        for(int neighbor: graph[cur]) {
            traverse(neighbor, target, new ArrayList<>(paths) , graph);
        }

        if (cur == target) {
            output.add(paths);
        }
    }
}
