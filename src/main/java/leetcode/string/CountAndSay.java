package leetcode.string;

public class CountAndSay {
  public String countAndSay(int n) {
    String[] ans = new String[n];
    ans[0] = "1";

    for (int i = 1; i < n; i++) {
      StringBuilder sb = new StringBuilder();

      String prev = ans[i - 1];

      for (int j = 0; j < prev.length(); ) {
        int count = 1;
        char ch = prev.charAt(j++);
        while (j < prev.length() && prev.charAt(j - 1) == prev.charAt(j)) {
          count++;
          j++;
        }

        sb.append(count);
        sb.append(ch);
      }

      ans[i] = sb.toString();
    }
    return ans[n - 1];
  }
}
