package leecode;

public class BinaryNumberWithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		if (n == 0) {
			return false;
		}
		while (n > 0) {
			if ((n & 1) == ((n >>> 1) & 1)) {
				return false;
			}
			n = n >>> 1;
		}
		return true;
	}
}
