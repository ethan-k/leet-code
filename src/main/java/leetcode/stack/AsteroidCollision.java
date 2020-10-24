package leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
  public int[] asteroidCollision(int[] asteroids) {

    Stack<Integer> stack = new Stack<>();
    List<Integer> ret = new ArrayList<>();
    for (int asteroid : asteroids) {
      if (stack.isEmpty()) {
        stack.push(asteroid);
      } else {
        stack.push(asteroid);
        while (!stack.isEmpty()) {
          int top = stack.pop();
          if (stack.isEmpty()) {
            stack.push(top);
            break;
          }
          int nextTop = stack.pop();

          if (nextTop > 0 && top < 0) {
            if (Math.abs(top) < Math.abs(nextTop)) {
              stack.push(nextTop);
            } else if (Math.abs(top) > Math.abs(nextTop)) {
              stack.push(top);
            }
          } else {
            stack.push(nextTop);
            stack.push(top);
            break;
          }

        }

      }

    }

    for (Integer ele : stack) {
      ret.add(ele);
    }

    int[] result = new int[ret.size()];
    for (int i = 0; i < ret.size(); i++) {
      result[i] = ret.get(i);
    }

    return result;
  }
}
