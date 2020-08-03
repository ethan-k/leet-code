package leetcode.hashtable;

import java.util.*;

public class FindDuplicateFileInSystem {
  public List<List<String>> findDuplicate(String[] paths) {

    List<List<String>> ret = new ArrayList<>();

    Map<String, List<String>> map = new HashMap<>();

    for (String path : paths) {
      String[] split = path.split(" ");

      String directory = split[0];

      for (int i = 1; i < split.length; i++) {
        String file = split[i];
        String[] split2 = file.split("\\.txt");
        String filename = split2[0];
        String content = split2[1];

        if (!map.containsKey(content)) {
          map.put(content, new ArrayList<>());
        }
        map.get(content).add(directory + "/" + filename + ".txt");
      }
    }

    for (List<String> value : map.values()) {
      if (value.size() > 1)
        ret.add(value);
    }

    return ret;
  }
}
