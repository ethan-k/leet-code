package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class RansomNote {

	public static void main(String[] args) {
		String a = "a", b = "b";
		String c = "aa", d = "ab";
		String e = "aadd", f = "aabddddd";
		System.out.println(canConstruct(a, b));
		System.out.println(canConstruct(c, d));
		System.out.println(canConstruct(e, f));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		char[] ransomChars = ransomNote.toCharArray();
		char[] magazineChars = magazine.toCharArray();
		Arrays.sort(magazineChars);
		LinkedList<Character> linkedList = new LinkedList<>();
		for (char magazineChar : magazineChars) {
			linkedList.add(magazineChar);
		}
		for (char ransomChar : ransomChars) {
			if (linkedList.contains(ransomChar)) {
				linkedList.remove(linkedList.indexOf(ransomChar));
			} else {
				return false;
			}
		}
		return true;

	}

}
