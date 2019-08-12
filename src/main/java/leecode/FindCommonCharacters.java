package leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
  public static void main(String[] args) {
    String[] input = new String[]{"bella", "label", "roller"};
    System.out.println(new FindCommonCharacters().commonChars(input));
  }

  String chars = "abcdefghijklmnopqrstuwxyz";

  public List<String> commonChars(String[] A) {

    List<String> result = new ArrayList<>();
    List<Map<Character, Integer>> list = new ArrayList<>();
    for (String s : A) {
      Map<Character, Integer> temp = new HashMap<>();
      for (char c : s.toCharArray()) {
        temp.put(c, temp.getOrDefault(c, 0) + 1);
      }
      list.add(temp);
    }
    for (char value : chars.toCharArray()) {
      int count = Integer.MAX_VALUE;
      for (Map<Character, Integer> characterIntegerMap : list) {
        count = Math.min(count, characterIntegerMap.getOrDefault(Character.valueOf(value), 0));
      }
      for (int i = 0; i < count; i++) {
        result.add(String.valueOf(value));
      }
    }
    return result;
  }
}
