package leetcode;

public class RomanToInteger {
	public int romanToInt(String s) {
		int result = 0;
		char[] chars = s.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			int value = getValueByRomanChar(chars[i]);

			if (chars.length > 1 && i < chars.length - 1) {
				if (chars[i] == 'I' && chars[i + 1] == 'X') {
					value = -value;
				}

				if (chars[i] == 'I' && chars[i + 1] == 'V') {
					value = -value;
				}
				if (chars[i] == 'X' && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
					value = -value;
				}
				if (chars[i] == 'C' && (chars[i + 1]) == 'M') {
					value = -value;
				}

				if (chars[i] == 'C' && (chars[i + 1]) == 'D') {
					value = -value;
				}
			}

			result += value;
		}
		return result;
	}

	public int getValueByRomanChar(char c) {
		int value = 0;
		switch (c) {
			case 'I':
				value = 1;
				break;
			case 'V':
				value = 5;
				break;
			case 'X':
				value = 10;
				break;
			case 'L':
				value = 50;
				break;
			case 'C':
				value = 100;
				break;
			case 'D':
				value = 500;
				break;
			case 'M':
				value = 1000;
				break;
		}
		return value;
	}
}
