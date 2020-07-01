package leetcode;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		char[] sorted1 = s.toCharArray();
		char[] sorted2 = t.toCharArray();
		Arrays.sort(sorted1);
		Arrays.sort(sorted2);
		return new String(sorted1).equals(new String(sorted2));
	}
}
