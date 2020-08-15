package leetcode.array;

import java.util.*;

public class GameOfLife {
  int ROWS;
  int COLS;


  public void gameOfLife(int[][] board) {

        /*
        Any live cell with fewer than two live neighbors dies, as if caused by under-population.
        Any live cell with two or three live neighbors lives on to the next generation.
        Any live cell with more than three live neighbors dies, as if by over-population..
        Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
        */

    this.ROWS = board.length;
    if (this.ROWS == 0)
      return;
    this.COLS = board[0].length;

    int[][] clone = new int[this.ROWS][this.COLS];
    for (int i = 0; i < this.ROWS; i++) {
      clone[i] = Arrays.copyOf(board[i], board[i].length);
    }

    for (int i = 0; i < ROWS; i++)
      for (int j = 0; j < COLS; j++) {
        int count = countNeighbors(i, j, clone);

        if (board[i][j] == 1) {
          if (count < 2) {
            board[i][j] = 0;
          } else if (count > 3) {
            board[i][j] = 0;
          }
        } else {
          if (count == 3) {
            board[i][j] = 1;
          }
        }

      }
  }

  int countNeighbors(int row, int col, int[][] board) {
    int count = 0;
    for (int r = row - 1; r <= row + 1; r++)
      for (int c = col - 1; c <= col + 1; c++) {
        if (r == row && c == col)
          continue;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length)
          continue;

        if (board[r][c] == 1)
          count++;
      }
    return count;
  }
}
