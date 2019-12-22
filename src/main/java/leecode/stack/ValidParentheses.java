package leecode.stack;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(new ValidParentheses().isValid("()"));
    System.out.println(new ValidParentheses().isValid("()[]{}"));
    System.out.println(new ValidParentheses().isValid("([)]"));
    System.out.println(new ValidParentheses().isValid("(]"));
    System.out.println(new ValidParentheses().isValid("{[]}"));
    System.out.println(new ValidParentheses().isValid("[])"));
  }

  public boolean isValid(String s) {
    if (s.length() == 1)
      return false;
    char[] arr = s.toCharArray();
    Stack<Character> stack = new Stack<>();

    for (char c : arr) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
        continue;
      }

      if (!stack.isEmpty()) {
        char top = stack.peek();
        if (top == '(') {
          if (c != ')') {
            return false;
          }
          stack.pop();
        } else if (top == '{') {
          if (c != '}') {
            return false;
          }
          stack.pop();
        } else if (top == '[') {
          if (c != ']') {
            return false;
          }
          stack.pop();
        } else {
          stack.push(c);
        }
      } else {
        stack.push(c);
      }
    }
    return stack.size() == 0;
  }
}
