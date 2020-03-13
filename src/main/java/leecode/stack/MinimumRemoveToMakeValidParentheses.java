package leecode.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
  public String minRemoveToMakeValid(String s) {
    int openCnt = 0, closeCnt = 0;

    char[] arr = s.toCharArray();
    Set<Integer> indexToRemove = new HashSet<>();
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '(') {
        stack.push(i);
        openCnt++;
      } else if (arr[i] == ')') {
        if (openCnt == 0) {
          indexToRemove.add(i);
        } else {
          stack.pop();
          openCnt--;
        }
      }
    }

    while (!stack.isEmpty()) {
      indexToRemove.add(stack.pop());
    }


    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      if (indexToRemove.contains(i))
        continue;
      sb.append(arr[i]);
    }

    return sb.toString();

  }
}
