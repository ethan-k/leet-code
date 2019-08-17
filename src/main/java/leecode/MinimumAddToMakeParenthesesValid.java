package leecode;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
  public static void main(String[] args) {
    System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("()))(("));
  }

  //"()))(("
  public int minAddToMakeValid(String S) {
    Stack<Character> stack = new Stack<>();

    char[] chars = S.toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '(') {
        stack.push(chars[i]);
        continue;
      }

      if (chars[i] == ')') {
        if (stack.size() != 0) {
          stack.pop();
        } else {
          count++;
        }
      }
    }
    return count + stack.size();
  }

}
