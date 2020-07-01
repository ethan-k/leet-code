package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation {

  public static void main(String[] args) {
    System.out.println(new LetterCasePermutation().letterCasePermutation("a1b2"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("3z4"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("12345"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("c"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("po"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("FKqeaCFIESzo"));
  }

  public List<String> letterCasePermutation(String S) {
    Set<String> result = new HashSet<>();
    bfs("", S, result);

    return new ArrayList<>(result);
  }

  public void bfs(String prefix, String s, Set<String> result) {
    if (s.length() == 0) {
      result.add(prefix);

      return;
    }
    StringBuilder builder = new StringBuilder();
    builder.append(prefix);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      bfs(builder.toString() + c, s.substring(i + 1), result);
      if (Character.isLowerCase(c)) {
        bfs(builder.toString() + Character.toUpperCase(c), s.substring(i + 1), result);
      } else if (Character.isUpperCase(c)) {
        bfs(builder.toString() + Character.toLowerCase(c), s.substring(i + 1), result);
      }
      builder.append(c);
    }
  }

}
