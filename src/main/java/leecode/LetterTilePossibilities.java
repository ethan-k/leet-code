package leecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
  public static void main(String[] args) {
    System.out.println(new LetterTilePossibilities().numTilePossibilities("AAB"));
  }

  private Set<String> set = new HashSet<>();

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
