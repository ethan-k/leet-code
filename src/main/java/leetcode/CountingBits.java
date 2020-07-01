package leetcode;

public class CountingBits {
	public int[] countBits(int num) {
		int[] result = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			result[i] = getBitCount(i);
		}
		return result;
	}

	public int getBitCount(int n) {
		int result = 0;
		while (n != 0) {
			result += n & 1;
			n = n >>> 1;
		}
		return result;
	}
}
