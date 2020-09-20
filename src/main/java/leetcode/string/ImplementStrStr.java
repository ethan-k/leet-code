package leetcode.string;

public class ImplementStrStr {
  public int strStr(String haystack, String needle) {

    if (needle.isEmpty())
      return 0;

    if (haystack.isEmpty())
      return -1;

    if (needle.length() > haystack.length())
      return -1;
    int n = needle.length();

    for (int i = 0; i < haystack.length() - n + 1; i++) {
      if (i + n > haystack.length())
        break;

      if (haystack.substring(i, i + n).equals(needle)) {
        return i;
      }

    }
    return -1;
  }
}
