package leecode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatest = Integer.MIN_VALUE;
    for (int i = 0; i < candies.length; i++) {
      greatest = Math.max(candies[i], greatest);
    }

    List<Boolean> ret = new ArrayList<>();
    for (int candy : candies) {
      if ((candy + extraCandies) >= greatest) {
        ret.add(true);
      } else {
        ret.add(false);
      }
    }
    return ret;
  }
}
