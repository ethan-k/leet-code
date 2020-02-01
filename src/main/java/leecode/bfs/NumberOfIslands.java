package leecode.bfs;

public class NumberOfIslands {
  public int numIslands(char[][] grid) {

    if (grid == null || grid.length == 0) {
      return 0;
    }
    int islands = 0;
    int rows = grid.length;
    int cols = grid[0].length;

    boolean[][] visited = new boolean[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == '1') {
          islands++;
          flipIslands(i, j, grid);
        }
      }
    }
    return islands;

  }

  void flipIslands(int x, int y, char[][] grid) {
    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
      return;
    }

    if (grid[x][y] == '1') {
      grid[x][y] = '0';
      flipIslands(x - 1, y, grid);
      flipIslands(x + 1, y, grid);
      flipIslands(x, y - 1, grid);
      flipIslands(x, y + 1, grid);
    }
  }
}
