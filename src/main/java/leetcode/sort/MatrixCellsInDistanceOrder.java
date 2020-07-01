package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class MatrixCellsInDistanceOrder {
  public static void main(String[] args) {

    for (int[] ints : allCellsDistOrder(1, 2, 0, 0)) {
      System.out.print(Arrays.toString(ints) + " ");
    }
    System.out.println();
    for (int[] ints : allCellsDistOrder(2, 2, 0, 1)) {
      System.out.print(Arrays.toString(ints) + " ");
    }
    System.out.println();
    for (int[] ints : allCellsDistOrder(2, 3, 1, 2)) {
      System.out.print(Arrays.toString(ints) + " ");
    }


  }

  public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

    TreeMap<Integer, List<Integer[]>> map = new TreeMap<>();
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        int distance = Math.abs(i - r0) + Math.abs(j - c0);
        List<Integer[]> integers = map.getOrDefault(distance, new ArrayList<>());
        integers.add(new Integer[]{i, j});
        map.put(distance, integers);
      }
    }

    int output[][] = new int[R*C][2];
    int x = 0;
    for (List<Integer[]> value : map.values()) {
      for (Integer[] integers : value) {
        output[x][0] = integers[0];
        output[x][1] = integers[1];
        x++;

      }
    }
    return output;
  }
}
