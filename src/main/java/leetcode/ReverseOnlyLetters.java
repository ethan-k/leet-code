package leetcode;

import java.util.Stack;

public class ReverseOnlyLetters {
  public static void main(String[] args) {

  }

  public String reverseOnlyLetters(String S) {
    Stack<Character> stack = new Stack<>();
    char[] chars = S.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (Character.isLetter(chars[i])) {
        stack.push(S.charAt(i));
      }
    }

    for (int i = 0; i < chars.length; i++) {
      if (Character.isLetter(chars[i])) {
        chars[i] = stack.pop();
      }
    }

    return new String(chars);
  }
}
