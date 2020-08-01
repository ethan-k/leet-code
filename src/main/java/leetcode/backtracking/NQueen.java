package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
  char[][] board;
  int N;
  List<List<String>> ret = new ArrayList<>();

  boolean isSafe(int x, int y, char[][] board) {
    for (int i = 0; i < N; i++)
      for (int j = 0; j < N; j++) {
        if (board[i][j] == 'Q' && i == x && j != y)
          return false;
        else if (board[i][j] == 'Q' && i != x && j == y)
          return false;
        else if (board[i][j] == 'Q' && (i + j == x + y || i - j == x - y))
          return false;
      }
    return true;
  }

  public List<List<String>> solveNQueens(int n) {
    this.N = n;
    this.board = new char[n][n];
    for (char[] chars : board) {
      Arrays.fill(chars, '.');
    }

    placeNQueens(n, 0, board);

    return ret;
  }



  void placeNQueens(int n, int placedCount, char[][] board) {
    if (placedCount == n) {
      List<String> array = new ArrayList<>();
      for(char[] row: board) {
        array.add(new String(row));
      }
      ret.add(array);
    }

    for(int j=0;j<n;j++) {
      if (isSafe(placedCount, j, board)) {
        board[placedCount][j] = 'Q';
        placeNQueens(n, placedCount+1, board);
        board[placedCount][j] = '.';;
      }
    }
  }
}
