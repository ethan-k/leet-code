package leetcode;

import java.util.Arrays;
public class PlusOne {
	public static void main(String[] args) {
		int[] input1 = {9,9,9};
		int[] input2 = {8,7};
		int[] input3 = {8,9};
		System.out.println(Arrays.toString(plusOne(input1)));
		System.out.println(Arrays.toString(plusOne(input2)));
		System.out.println(Arrays.toString(plusOne(input3)));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			int digitIndex = digits.length - i -1;
			int cur = digits[digitIndex] + 1;
			if (cur == 10 && digitIndex == 0) {
				digits[digitIndex] = 0;
				int[] tmp = new int[digits.length + 1];
				for (int j = digitIndex; j < digits.length; j++) {
					tmp[j+1] = digits[j];
				}
				digits = tmp;
			} else if (cur == 10) {
				digits[digitIndex] = 0;
			} else {
				digits[digitIndex] = cur;
				break;
			}
		}
		return digits;
	}
}
