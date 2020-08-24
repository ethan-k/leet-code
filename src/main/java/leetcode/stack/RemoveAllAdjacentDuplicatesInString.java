package leetcode.stack;

import java.util.*;

public class RemoveAllAdjacentDuplicatesInString {
  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < S.length(); i++) {
      if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
        stack.pop();
      } else {
        stack.push(S.charAt(i));
      }
    }

    StringBuilder sb = new StringBuilder();

    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }
}
