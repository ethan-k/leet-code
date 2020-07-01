package leetcode;

import java.util.Arrays;

public class FloodFill {
	private static boolean[][] filled;

	public static void main(String[] args) {

		int[][] input = {{1,1,1}, {1,1,0}, {1,0,1}};
		System.out.println(Arrays.deepToString(floodFill(input, 1,1, 2)));

		System.out.println(Arrays.deepToString(filled));
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		filled = new boolean[image.length][image[0].length];
		filled[sr][sc] = true;
		floodFill2(image, sr, sc, newColor);

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				if (filled[i][j] == true) {
					image[i][j] = newColor;
				}
			}
		}
		return image;

	}

	public static void floodFill2(int[][] image, int sr, int sc, int newColor) {

		if ((sr - 1 >= 0) && image[sr][sc] == image[sr -1][sc] && filled[sr-1][sc] == false) {
			filled[sr-1][sc] = true;
//			image[sr -1][sc] = newColor;
			floodFill2(image, sr -1, sc, newColor);
		}

		if ((sr + 1 < image.length) && image[sr][sc] == image[sr+1][sc] && filled[sr+1][sc] == false) {
			filled[sr+1][sc] = true;
//			image[sr+1][sc] = newColor;
			floodFill2(image, sr +1, sc, newColor);
		}

		if ((sc - 1>= 0) && image[sr][sc] == image[sr][sc -1] && filled[sr][sc -1] == false) {
			filled[sr][sc -1] = true;
//			image[sr][sc-1] = newColor;
			floodFill2(image, sr, sc-1, newColor);
		}

		if ((sc + 1 < image[0].length) && image[sr][sc] == image[sr][sc + 1] && filled[sr][sc+1] == false) {
			filled[sr][sc + 1] = true;
//			image[sr][sc + 1] = newColor;
			floodFill2(image, sr , sc +1, newColor);
		}

	}
}
