package leecode;

class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int numRow = grid.length;
        int numColumn = grid[0].length;
        int[] topViewGrid = new int[grid[0].length];
        int[] leftViewGrid = new int[grid.length];

        int sum = 0;
        for (int i = 0; i < topViewGrid.length; i++) {
            for (int j = 0; j < numColumn; j++) {
                topViewGrid[i] = Math.max(grid[j][i], topViewGrid[i]);
            }
        }

        for (int i = 0; i < leftViewGrid.length; i++) {
            for (int j = 0; j < numRow; j++) {
                leftViewGrid[i] = Math.max(grid[i][j], leftViewGrid[i]);
            }
        }

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numColumn; j++) {
                sum += Math.abs(grid[i][j] - Math.min(topViewGrid[j], leftViewGrid[i]));
            }
        }

        return sum;
    }
}