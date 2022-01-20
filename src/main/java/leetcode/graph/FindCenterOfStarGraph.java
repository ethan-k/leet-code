package leetcode.graph;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int target = edges.length;
        int[] count = new int[edges.length + 2];

        for(int[] edge: edges) {
            count[edge[0]] = count[edge[0]] + 1;
            count[edge[1]] = count[edge[1]] + 1;
        }

        for(int i=0; i<count.length; i++)  {
            if (count[i] == target)
                return i;
        }

        return -1;
    }
}
