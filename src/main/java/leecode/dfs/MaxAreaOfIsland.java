package leecode.dfs;

public class MaxAreaOfIsland {
    int max = 0;
    int width;
    int height;

    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0)
            return 0;

        height = grid.length;
        width = grid[0].length;

        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if (grid[i][j] == 1) {
                    calculdateMaxArea(i, j, grid);
                }


        return max;
    }

    int calculdateMaxArea(int x, int y, int[][] grid) {

        if (x < 0 || y < 0 || x == height || y == width || grid[x][y] == 0)
            return 0;

        grid[x][y] = 0;
        int top = calculdateMaxArea(x, y + 1, grid);
        int left = calculdateMaxArea(x - 1, y, grid);
        int right = calculdateMaxArea(x + 1, y, grid);
        int bottom = calculdateMaxArea(x, y - 1, grid);

        max = Math.max(top + left + right + bottom + 1, max);

        return top + left + right + bottom + 1;
    }
}
