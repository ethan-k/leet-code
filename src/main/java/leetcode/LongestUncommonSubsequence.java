package leetcode;

public class LongestUncommonSubsequence {

	public static void main(String[] args) {

		LongestUncommonSubsequence longestUncommonSubsequence = new LongestUncommonSubsequence();
		System.out.println(longestUncommonSubsequence.findLUSlength("ada", "aba"));
	}

	public int findLUSlength(String a, String b) {
		if (a.equals(b)) {
			return -1;
		}
		if (a.length() > b.length()) {
			return a.length();
		} else if (a.length() < b.length()) {
			return b.length();
		} else {
			int max = a.length();
			for (int i = 0; i < b.length(); i++) {
				if (a.indexOf(b.substring(i)) == -1) {
					max = b.length() - i;
					break;
				}
			}
			return max;
		}
	}
}
