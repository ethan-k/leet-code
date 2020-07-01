package leetcode;

public class PowerOfFour {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(15));
		System.out.println(isPowerOfFour(8));
	}

	public static boolean isPowerOfFour(int num) {
		int four = 4;
		for (int i = 0; i < 32; i++) {
			if (four == num) {
				return true;
			}
			four = four << 2;
			if (four > num) {
				return false;
			}
		}
		return false;
	}
}
