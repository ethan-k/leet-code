package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] input = {"abcd","ab","addd"};
		new LongestCommonPrefix().longestCommonPrefix(input);
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		Arrays.sort(strs, Comparator.comparingInt(String::length));
		String shortest = strs[0];
		boolean pass = true;
		while(true) {
			for (String str : strs) {
				if (!str.startsWith(shortest)) {
					shortest = shortest.substring(0, shortest.length() - 1);
					pass = false;
					break;
				}
				pass = true;
			}
			if (shortest.length() == 0) {
				return "";
			}
			if (pass) {
				return shortest;
			}
		}
	}
}

class Solution {
	public String longestCommonPrefix(String[] strs) {

		return findPrefix(0, "", strs);
	}

	public String findPrefix(int curIdx, String prefix, String[] strs) {

		boolean matched = true;
		char ch = Character.MIN_VALUE;
		for(String str: strs) {
			if (curIdx >= str.length()) {
				return "";
			}

			if (ch == Character.MIN_VALUE) {
				ch = str.charAt(curIdx);
			} else {
				if (ch != str.charAt(curIdx))
					return "";
			}
		}

		if (matched) {
			return findPrefix(curIdx + 1, prefix + ch, strs);
		}

		return prefix;
	}


}