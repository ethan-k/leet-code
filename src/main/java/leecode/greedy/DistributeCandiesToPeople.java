package leecode.greedy;

import java.util.Arrays;

public class DistributeCandiesToPeople {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(distributeCandies(7, 4)));
    System.out.println(Arrays.toString(distributeCandies(10, 3)));
  }

  public static int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];

    int i = 0;
    int candiToDistribute = 1;
    while (candies != 0) {
      if (candies < candiToDistribute) {
        result[i % num_people] += candies;
        candiToDistribute = candies;
        candies -= candies;
      } else {
        result[i % num_people] += candiToDistribute;
        candies -= candiToDistribute;
        candiToDistribute++;
      }
      i++;
    }
    return result;
  }
}
