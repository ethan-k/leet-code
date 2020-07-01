package leetcode;

public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		System.out.println(titleToNumber("Z"));
	}
	public static int titleToNumber(String s) {
		char[] chars = s.toCharArray();
		int result = 0;
		for(int i = chars.length -1; i >= 0; i--) {
			result += (chars[i] - 'A' + 1) * Math.pow(26, chars.length -1 - i);
		}
		return result;
	}
}
