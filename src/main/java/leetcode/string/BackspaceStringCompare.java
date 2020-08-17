package leetcode.string;

import java.util.*;

public class BackspaceStringCompare {
  public boolean backspaceCompare(String S, String T) {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for (int i = 0; i < S.length(); i++) {

      char ch = S.charAt(i);

      if (ch == '#') {
        if (sb1.toString().isEmpty())
          continue;
        sb1.deleteCharAt(sb1.length() - 1);
      } else {
        sb1.append(ch);
      }
    }

    for (int i = 0; i < T.length(); i++) {

      char ch = T.charAt(i);

      if (ch == '#') {
        if (sb2.toString().isEmpty())
          continue;
        sb2.deleteCharAt(sb2.length() - 1);
      } else {
        sb2.append(ch);
      }
    }

    return sb1.toString().equals(sb2.toString());
  }
}
