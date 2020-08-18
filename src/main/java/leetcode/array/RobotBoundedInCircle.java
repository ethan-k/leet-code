package leetcode.array;

public class RobotBoundedInCircle {
  public boolean isRobotBounded(String instructions) {
    int[][] dirs = new int[][]{
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0},
    };

    int dir = 0;
    int[] coord = new int[]{0, 0};

    for (int i = 0; i < instructions.length(); i++) {
      char c = instructions.charAt(i);
      if (c == 'L') {
        dir--;
        if (dir < 0)
          dir = 3;
      } else if (c == 'R') {
        dir++;
        dir = dir % 4;
      } else {
        coord[0] += dirs[dir][0];
        coord[1] += dirs[dir][1];
      }
    }

    return (coord[0] == 0 && coord[1] == 0) || dir != 0;
  }
}
