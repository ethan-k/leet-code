package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterTilePossibilities {
  public static void main(String[] args) {
    System.out.println(new LetterTilePossibilities().numTilePossibilities("AAB"));
  }

  private List<String> set = new ArrayList<>();

  public int numTilePossibilities(String tiles) {


    permudate("", tiles);

    return set.size();

  }

  private void permudate(String per, String tiles) {

    if (!per.isEmpty()) {
      set.add(per);
    }
    for (int i = 0; i < tiles.length(); i++) {
      permudate(per + tiles.charAt(i), tiles.substring(0, i) + tiles.substring(i + 1));
    }

  }
}
