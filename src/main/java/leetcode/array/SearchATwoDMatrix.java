package leetcode.array;

public class SearchATwoDMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0)
      return false;

    int targetRow = 0;
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
        targetRow = i;
        break;
      }
    }
    if (matrix[targetRow][0] <= target && matrix[targetRow][matrix[targetRow].length - 1] >= target) {
      return binearySearch(matrix[targetRow], target);
    }

    return false;
  }

  boolean binearySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;

      if (arr[middle] == target) {
        return true;
      } else if (arr[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    return false;
  }
}
