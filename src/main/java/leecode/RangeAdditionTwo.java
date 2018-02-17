package leecode;

public class RangeAdditionTwo {
	public int maxCount(int m, int n, int[][] ops) {
		if (ops.length == 0) {
			return m * n;
		}
		int x = ops[0][0];
		int y = ops[0][1];

		for (int i = 1; i < ops.length; i++) {
			x = Math.min(ops[i][0], x);
			y = Math.min(ops[i][1], y);
		}

		return x * y;

	}
}
