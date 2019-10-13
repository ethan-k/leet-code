package leecode;


import java.util.Arrays;

public class UniquePaths {

  public static void main(String[] args) {
    System.out.println(new UniquePaths().uniquePaths(12,23));
  }
  Integer[][] grid;

  public int uniquePaths(int m, int n) {
    grid = new Integer[m+1][n+1];
    return dp(m, n);
  }

  public int dp(int m, int n) {
    if (m <= 0 || n <= 0) {
      return 0;
    }
    if (m == 1 && n == 1) {
      return 1;
    }

    if (m == 1 && n == 2) {
      return 1;
    }

    if (m == 2 && n == 1) {
      return 1;
    }

    if (grid[m][n] != null) {
      return grid[m][n];
    }

    return grid[m][n] = dp(m - 1, n) + dp(m, n - 1);
  }
}
