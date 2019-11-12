package leecode;

public class CellsWithOddValuesInAMatrix {

  public static void main(String[] args) {

  }

  public int oddCells(int n, int m, int[][] indices) {
    int[][] matrix = new int[n][m];

    for (int[] index : indices) {
      int row = index[0];
      int column = index[1];

      for (int i = 0; i < m; i++) {
        matrix[row][i] += 1;
      }

      for (int j = 0; j < n; j++) {
        matrix[j][column] += 1;
      }
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] % 2 !=0) {
          count++;
        }
      }
    }
    return count;
  }
}
