package leetcode.dfs;

public class UniquePathsThree {
  int M;
  int N;
  int total = 0;

  public int uniquePathsIII(int[][] grid) {
    this.M = grid.length;
    this.N = grid[0].length;

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (grid[i][j] == 1) {
          traverse(i, j, grid, new boolean[M][N]);
        }
      }
    }
    return total;
  }

  public void traverse(int x, int y, int[][] grid, boolean[][] seen) {

    if (x < 0 || y < 0 || x >= M || y >= N || grid[x][y] == -1 || seen[x][y]) {
      return;
    }

    if (grid[x][y] == 2 && noZero(grid)) {
      total++;
    }

    int[][] dirs = new int[][]{
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1},
    };

    if (grid[x][y] == 1 || grid[x][y] == 0) {
      grid[x][y] = -1;
      for (int[] dir : dirs) {
        traverse(x + dir[0], y + dir[1], grid, seen);
      }
      grid[x][y] = 0;
    }
  }

  public boolean noZero(int[][] grid) {
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (grid[i][j] == 0)
          return false;
      }
    }
    return true;
  }
}
