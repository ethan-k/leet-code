package leecode.greedy;

public class SplitAStringInBalancedStrings {
  public static void main(String[] args) {
    System.out.println(balancedStringSplit("RLRRLLRLRL"));
    System.out.println(balancedStringSplit("RLLLLRRRLR"));
    System.out.println(balancedStringSplit("LLLLRRRR"));
    System.out.println(balancedStringSplit("RLRRRLLRLL"));
  }

  public static int balancedStringSplit(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char curChar = s.charAt(i);
      int curCharCount = 1;
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(j) == curChar) {
          curCharCount++;
        } else {
          curCharCount--;
        }
        if (curCharCount == 0) {
          sum++;
          i = j;
          break;
        }
      }
    }
    return sum;
  }
}
