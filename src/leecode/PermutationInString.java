package leecode;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {

	public static void main(String[] args) {

		String s1 = "abcde", s2 = "eidbaooo";
		String s3 = "ab", s4 = "eidboaoo";
		//		System.out.println(checkInclusion(s1, s2));
		//		System.out.println(checkInclusion(s3, s4));
		Set<String> set = new HashSet<>();
		set.add("ba");
		set.add("ab");

		System.out.println(s1.substring(0, 1) + s1.substring(2, s1.length()));
	}

	//	public static boolean checkInclusion(String s1, String s2) {
	//		int length = s1.length();
	//		if (length == 0) {
	//			return false;
	//		}
	//
	//	}

	public static String createPermutation(String s, Set<String> r) {
		//		Queue<Character> queue = new LinkedBlockingQueue();
		//		char[] chars = s.toCharArray();
		//		Set<String> set = new HashSet<>();
		//
		//		for (char aChar : chars) {
		//			queue.add(aChar);
		//		}
		//		for(int i = 0; i < chars.length; i++) {
		//			char prefix = queue.poll();
		//
		//		}
		return null;
	}
}
