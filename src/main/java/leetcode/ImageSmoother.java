package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class ImageSmoother {
	public static void main(String[] args) {
		int[][] testInput = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}};
		System.out.println(Arrays.deepToString(imageSmoother(testInput)));
	}

	public static int[][] imageSmoother(int[][] M) {
		int width = M[0].length;
		int height = M.length;
		LinkedList<Double> linkedList = new LinkedList<>();
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				linkedList.add(getSumOfSurrounding(x, y, width, height, M));
			}
		}
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				M[x][y] = linkedList.poll().intValue();
			}
		}
		return M;
	}

	private static double getSumOfSurrounding(int x, int y, int width, int height, int[][] M) {
		int count = 0;
		int result = 0;
		for (int i = -1; i <= 1; i++) {
			if (x + i < 0 || (x + i) >= height) {
				continue;
			}
			for (int j = -1; j <= 1; j++) {
				if (y + j < 0 || (y + j) >= width) {
					continue;
				}
				result += M[x + i][y + j];
				count++;
			}
		}
		return Math.floor(result / count);
	}
}
/**
 * Input:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * Output:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 */
