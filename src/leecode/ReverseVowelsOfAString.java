package leecode;

import java.util.Stack;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		System.out.println(new ReverseVowelsOfAString().reverseVowels("aA"));
	}
	public String reverseVowels(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = new char[s.length()];
		char[] stringChars = s.toCharArray();

		for (char c : stringChars) {
			if ("aiuoeAIUOE".indexOf(c) != -1) {
				stack.push(c);
			}
		}

		for (int i = 0; i < stringChars.length; i++) {
			if ("aiuoeAIUOE".indexOf(stringChars[i]) != -1) {
				chars[i] = stack.pop();
			} else {
				chars[i] = stringChars[i];
			}
		}

		return new String(chars);
	}
}
