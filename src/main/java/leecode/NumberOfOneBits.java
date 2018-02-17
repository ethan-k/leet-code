package leecode;

import java.math.BigInteger;

public class NumberOfOneBits {
	public static void main(String[] args) {
		System.out.println(hammingWeight(  Integer.MAX_VALUE));
	}

	public static int hammingWeight(int n) {
		int count = 0;
		while(n != 0) {
			int c = 0;
			c = n & 1;
			if (c == 1) {
				count++;
			}
			n = n >>> 1;
		}
		return count;
	}
}
