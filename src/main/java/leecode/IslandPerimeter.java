package leecode;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int result = 0;

		int height = grid.length;
		int row = grid[0].length;

		for(int i =0; i < height; i++) {
			for (int j = 0; j < row; j++) {
				if(grid[i][j] == 1) {
					int tmp = 4;
					if (i - 1 >= 0) {
						if(isIsland(i - 1, j, grid)) {
							tmp--;
						}
					}

					if (j - 1 >= 0) {
						if(isIsland(i, j - 1, grid)) {
							tmp--;
						}
					}

					if (i + 1 < height) {
						if(isIsland(i + 1, j, grid)) {
							tmp--;
						}
					}

					if (j + 1 < row) {
						if(isIsland(i, j + 1, grid)) {
							tmp--;
						}
					}
					result = result + tmp;
				}
			}
		}
		return result;
	}

	private boolean isIsland(int i, int j, int[][] grid) {
		return grid[i][j] == 1;
	}
}
