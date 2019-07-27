class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int numRow = grid.length;
        int numColumn = grid[0].length;
        int[] topViewGrid = new int[grid[0].length];
        int[] leftViewGrid = new int[grid.length];

        int sum = 0;
        for (int i = 0; i < numRow; i++) {

            for (int j = 0; j < numColumn; j++) {
                if (topViewGrid[j] == 0) {
                    topViewGrid[j] = grid[i][j];
                } else {
                    if (topViewGrid[j] < grid[i][j]) {
                        topViewGrid[j] = grid[i][j];
                    }
                }

                if (leftViewGrid[i] == 0) {
                    leftViewGrid[i] = grid[i][j];
                } else {
                    if (leftViewGrid[i] < grid[i][j]) {
                        leftViewGrid[i] = grid[i][j];
                    }
                }

            }
        }

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numColumn; j++) {
                int tallestBuildingFromLeft = leftViewGrid[i];
                int tallestBuildingFromTop = topViewGrid[j];
                if (tallestBuildingFromLeft < tallestBuildingFromTop) {
                    sum += (tallestBuildingFromLeft - grid[i][j]);
                } else {
                    sum += (tallestBuildingFromTop - grid[i][j]);
                }
            }
        }
        return sum;
    }
}