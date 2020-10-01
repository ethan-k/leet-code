package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LetterCombinationsOfAPhoneNumber {
  Map<Integer, String> map = new HashMap<>();

  public List<String> letterCombinations(String digits) {
    if (digits.length() == 0)
      return new ArrayList<>();
    map.put(2, "abc");
    map.put(3, "def");
    map.put(4, "ghi");
    map.put(5, "jkl");
    map.put(6, "mno");
    map.put(7, "pqrs");
    map.put(8, "tuv");
    map.put(9, "wxyz");

    int n = digits.length();
    int[] nums = new int[digits.length()];
    for (int i = 0; i < n; i++) {
      nums[i] = digits.charAt(i) - '0';
    }

    List<String> ret = new ArrayList<>();
    Queue<String> q = new LinkedList<>();

    int x = 0;
    while (x < n) {
      String num = map.get(nums[x]);
      int size = q.size();
      if (size == 0) {
        for (int i = 0; i < num.length(); i++) {
          String str = "";
          str += num.charAt(i);
          q.offer(str);
        }
      } else {
        for (int i = 0; i < size; i++) {
          String str = q.poll();

          for (int j = 0; j < num.length(); j++) {
            String tmp = str;
            tmp += num.charAt(j);
            q.offer(tmp);
          }
        }
      }
      x++;
    }
    while (!q.isEmpty()) {
      ret.add(q.poll());
    }

    return ret;
  }
}
