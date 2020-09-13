package leetcode.array;

public class SpiralMatrixTwo {
  public int[][] generateMatrix(int n) {
    int[][] ret = new int[n][n];
    int[][] dirs = new int[][]{
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0},
    };
    int x = 0, y = 0, d = 0;

    for (int i = 1; i <= n * n; i++) {

      ret[x][y] = i;
      int xx = x + dirs[d][0];
      int yy = y + dirs[d][1];

      if (xx < 0 || yy < 0 || xx == n || yy == n || ret[xx][yy] != 0) {
        d = (d + 1) % 4;
        x += dirs[d][0];
        y += dirs[d][1];
      } else {
        x = xx;
        y = yy;
      }

    }

    return ret;
  }
}
