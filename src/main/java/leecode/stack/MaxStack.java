package leecode.stack;

import java.util.Stack;

public class MaxStack {
  Stack<Integer> stack;
  Stack<Integer> maxStack;

  /**
   * initialize your data structure here.
   */
  public MaxStack() {
    stack = new Stack<>();
    maxStack = new Stack<>();
  }

  public void push(int x) {

    if (stack.isEmpty()) {
      maxStack.push(x);
    } else {
      if (x > maxStack.peek()) {
        maxStack.push(x);
      } else {
        maxStack.push(maxStack.peek());
      }
    }
    stack.push(x);
  }

  public int pop() {
    maxStack.pop();
    return stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int peekMax() {
    return maxStack.peek();
  }

  public int popMax() {
    Stack<Integer> tmp = new Stack<>();
    int max = maxStack.peek();
    while (max != stack.peek()) {
      tmp.push(stack.pop());
      maxStack.pop();
    }

    stack.pop();
    maxStack.pop();
    while (!tmp.isEmpty()) {
      push(tmp.pop());
    }

    return max;
  }
}
