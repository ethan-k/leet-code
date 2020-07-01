package leetcode.tree;

public class RemoveVowelsFromString {
  public String removeVowels(String S) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'u' || S.charAt(i) == 'o')
        continue;
      builder.append(S.charAt(i));
    }

    return builder.toString();
  }
}
