package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

  public static void main(String[] args) {
    System.out.println(new LetterCasePermutation().letterCasePermutation("a1b2"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("3z4"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("12345"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("c"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("po"));
    System.out.println(new LetterCasePermutation().letterCasePermutation("FKqeaCFIESzo"));
  }

  List<String> ret = new ArrayList<>();

  public List<String> letterCasePermutation(String S) {
    letterCasePermutation(S.toCharArray(), 0);
    return ret;
  }

  void letterCasePermutation(char[] chars, int idx) {
    if (idx == chars.length) {
      ret.add(new String(chars));
      return;
    }

    if (Character.isAlphabetic(chars[idx])) {
      chars[idx] = Character.toLowerCase(chars[idx]);
      letterCasePermutation(chars.clone(), idx + 1);
      chars[idx] = Character.toUpperCase(chars[idx]);
      letterCasePermutation(chars.clone(), idx + 1);
    } else {
      letterCasePermutation(chars, idx + 1);
    }
  }

}
