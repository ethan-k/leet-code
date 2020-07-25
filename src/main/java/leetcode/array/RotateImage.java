package leetcode.array;

class RotateImage {
  public void rotate(int[][] matrix) {

    if (matrix.length == 0)
      return;

    int ROWS = matrix.length;
    int COLS = matrix[0].length;

    for (int i = 0; i < ROWS; i++)
      for (int j = i; j < COLS; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    for (int i = 0; i < ROWS; i++) {
      int left = 0, right = COLS - 1;

      while (left < right) {
        int tmp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = tmp;
        left++;
        right--;
      }
    }
  }
}