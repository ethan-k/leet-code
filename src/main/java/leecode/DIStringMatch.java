package leecode;

import java.util.Arrays;

public class DIStringMatch {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new DIStringMatch().diStringMatch("IDID")));
    System.out.println(Arrays.toString(new DIStringMatch().diStringMatch("III")));
    System.out.println(Arrays.toString(new DIStringMatch().diStringMatch("DDI")));
  }
  public int[] diStringMatch(String S) {
    int[] result = new int[S.length() + 1];

    int leftNumber = 0;
    int rightNumber = S.length();
    for (int i = 0; i < S.length(); i++) {
      if(S.charAt(i) == 'I') {
        result[i] = leftNumber++;
        if (i == S.length() - 1) {
          result[i+1] = leftNumber++;
        }
      }
      else {
        result[i] = rightNumber--;
        if (i == S.length() - 1) {
          result[i+1] = rightNumber--;
        }
      }

    }
    return result;
  }
}
