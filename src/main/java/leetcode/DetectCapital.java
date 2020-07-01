package leetcode;

public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("b"));
	}
	public static boolean detectCapitalUse(String word) {
		char[] chars = word.toCharArray();
		if (word.length() == 1) {
			return true;
		}
		if (Character.isLowerCase(chars[0])) {
			for (char aChar : chars) {
				if (Character.isUpperCase(aChar)) {
					return false;
				}
			}
		} else {
			if (Character.isLowerCase(chars[1])) {
				for(int i = 2; i < chars.length; i++) {
					if (Character.isUpperCase(chars[i])) {
						return false;
					}
				}
			} else {
				for(int i = 2; i < chars.length; i++) {
					if (Character.isLowerCase(chars[i])) {
						return false;
					}

				}
			}
		}
		return true;
	}
}
