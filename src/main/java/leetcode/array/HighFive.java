package leetcode.array;

import java.util.Arrays;

public class HighFive {
  public int[][] highFive(int[][] items) {

    Arrays.sort(items, (a, b) -> {
      if (a[0] != b[0]) {
        return a[0] - b[0];
      }
      return b[1] - a[1];
    });

    int[][] ret = new int[items[items.length - 1][0]][2];

    int studentId = 1;

    for (int i = 0; i < items.length; i++) {
      if (items[i][0] == studentId) {
        int sum = 0;
        for (int start = 0; start < 5; ++start) {
          sum += items[i + start][1];
        }
        ret[studentId - 1] = new int[]{studentId, sum / 5};
        studentId++;
      }
    }

    return ret;
  }
}
