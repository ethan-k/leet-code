package leetcode.stack;

import java.util.HashMap;
import java.util.Map;
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

  Map<Character, Character> pairs;

  ValidParentheses() {
    pairs = new HashMap<>();
    pairs.put('(', ')');
    pairs.put('[', ']');
    pairs.put('{', '}');
  }

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for(int i=0;i<s.length();i++) {
      char c = s.charAt(i);
      if(pairs.containsKey(c)) {
        stack.push(c);
      } else {
        if (stack.isEmpty() || pairs.get(stack.pop()) != c)
          return false;
      }
    }
    return stack.size() == 0;
  }
}
