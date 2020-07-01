package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
  public static void main(String[] args) {
    System.out.println(new PositionsOfLargeGroups().largeGroupPositions("abbxxxxzzy'"));
    System.out.println(new PositionsOfLargeGroups().largeGroupPositions("abc'"));
    System.out.println(new PositionsOfLargeGroups().largeGroupPositions("abcdddeeeeaabbbcd'"));
  }

  public List<List<Integer>> largeGroupPositions(String S) {
    List<List<Integer>> result = new ArrayList<>();
    char[] chars = S.toCharArray();

    for (int i = 0, j = 0; i < chars.length; i = j) {
      int count = 0;
      while (j < chars.length && chars[i] == chars[j]) {
        count++;
        j++;
      }
      if (count >= 3) {
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(j - 1);
        result.add(temp);
      }
    }
    return result;
  }
}
