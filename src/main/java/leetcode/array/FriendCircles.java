package leetcode.array;

public class FriendCircles {
  int ROWS;
  int COLS;

  public int findCircleNum(int[][] M) {
    ROWS = M.length;
    COLS = M[0].length;

    int total = 0;
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        if (M[i][j] == 1) {
          total++;
          dfs(i, j, M);
        }
      }
    }

    return total;
  }


  public void dfs(int row, int col, int[][] M) {
    if (M[row][col] == 0)
      return;

    for (int i = 0; i < COLS; i++) {
      if (M[row][i] == 1) {
        M[row][i] = 0;
        dfs(i, row, M);
      }
    }
  }
}
