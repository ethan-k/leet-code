package leetcode.string;

public class StringCompression {
  public int compress(char[] chars) {

    if (chars.length == 1) {
      return 1;
    }
    int newSize = 0;
    int nextInplace = 0;
    for (int i = 0; i < chars.length; i++) {
      newSize++;
      char curChar = chars[i];
      int curCount = 1;
      int streak = 0;
      for (int j = i + 1; j < chars.length; j++) {
        if (chars[i] != chars[j]) {
          break;
        } else {
          streak++;
        }
      }
      curCount += streak;
      chars[nextInplace] = curChar;
      int countCharCount = 0;
      if (curCount > 1) {
        for (char c : String.valueOf(curCount).toCharArray()) {
          countCharCount++;
          chars[nextInplace + countCharCount] = c;
        }
      }

      i += streak;
      nextInplace += 1 + countCharCount;
      newSize += countCharCount;
    }

    return newSize;
  }
}
