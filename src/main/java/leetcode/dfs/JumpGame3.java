package leetcode.dfs;

public class JumpGame3 {

    public boolean canReach(int[] arr, int idx) {
        boolean[] visited = new boolean[arr.length];
        return canReach(arr, visited, idx);
    }

    public boolean canReach(int[] arr, boolean[] visited, int idx) {

        if (idx < 0 || idx >= arr.length || visited[idx])
            return false;

        if (arr[idx] == 0)
            return true;

        visited[idx] = true;

        return canReach(arr, visited, idx + arr[idx]) || canReach(arr, visited, idx - arr[idx]);
    }
}
