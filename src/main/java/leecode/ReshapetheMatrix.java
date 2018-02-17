package leecode;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class ReshapetheMatrix {

	public static void main(String[] args) {

		int[][] myIntArray = {{1, 2}, {3, 4}};
		int[][] myIntArray2 = {{1, 2, 3, 4}};
		System.out.println(Arrays.deepToString(matrixReshape(myIntArray, 1, 4)));
		System.out.println(Arrays.deepToString(matrixReshape(myIntArray2, 2, 2)));
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {

		int originalRowLength = nums.length;
		int originalColumnLength = nums[0].length;

		if (originalColumnLength * originalRowLength < r * c) {
			return nums;
		}

		int[][] result = new int[r][c];

		Queue<Integer> stack = new LinkedBlockingDeque();

		for (int i = 0; i < originalRowLength; i++) {
			for (int j = 0; j < originalColumnLength; j++) {
				stack.add(nums[i][j]);
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = stack.poll();
			}
		}

		return result;
	}
}
