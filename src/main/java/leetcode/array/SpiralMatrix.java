package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] array) {
        Set<String> visited = new HashSet<>();

        int m = array.length;
        int n = array[0].length;
        int total = m * n;

        int i = 0, j = 0;

        int curDir = 0;
        int[] dir = getNextDir(-1);
        List<Integer> ret = new ArrayList<>();

        while (visited.size() != total) {
            while (true) {
                String cord = i + "," + j;
                if (i < 0 || i >= m || j < 0 || j >= n || visited.contains(cord)) {
                    i = i - dir[0];
                    j = j - dir[1];
                    dir = getNextDir(curDir++);
                    i = i + dir[0];
                    j = j + dir[1];
                    break;
                }
                ret.add(array[i][j]);
                visited.add(cord);
                i = i + dir[0];
                j = j + dir[1];
            }

        }

        return ret;
    }

    int[] getNextDir(int current) {
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        return dirs[(current + 1) % 4];
    }
}
