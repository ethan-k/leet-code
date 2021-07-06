package leetcode.bit;

public class BinaryGap {
	public int binaryGap(int n) {
		String bin = Integer.toBinaryString(n);

		int lastPosition = 0;
		int dis = 0;

		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				dis = Math.max(dis, i - lastPosition);
				lastPosition = i;
			}
		}

		return dis;
	}
}
