package leetcode.array;

class SearchATwoDMatrixTwo {
  public boolean searchMatrix(int[][] matrix, int target) {

    if (matrix.length == 0 || matrix[0].length == 0)
      return false;
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      int left = 0, right = cols - 1;
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (matrix[i][mid] == target)
          return true;
        else if (matrix[i][mid] < target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    for (int i = 0; i < cols; i++) {
      int left = 0, right = rows - 1;
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (matrix[mid][i] == target)
          return true;
        else if (matrix[mid][i] < target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return false;
  }
}