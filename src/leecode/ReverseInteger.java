package leecode;

import java.math.BigInteger;

public class ReverseInteger {
	public int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		String value = String.valueOf(x);
		String[] strings = value.split("");

		int start = 0;
		StringBuilder sb = new StringBuilder();
		if (strings[0].equals("-")) {
			sb.append("-");
			start = 1;

		}
		for (int i = strings.length - 1; i >= start; i--) {
			sb.append(strings[i]);
		}

		long result = new BigInteger(sb.toString()).longValue();
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) result;
	}
}
