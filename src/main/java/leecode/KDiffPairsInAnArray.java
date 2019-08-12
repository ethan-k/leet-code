package leecode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class KDiffPairsInAnArray {
  public static void main(String[] args) {
    int[] input = new int[] {1,1,1,2,1};
    System.out.println(new KDiffPairsInAnArray().findPairs(input, 1));
  }


  class Pair {
    private int i;
    private int j;

    public Pair(int i, int j) {
      this.i = i;
      this.j = j;
    }

    public int getI() {
      return i;
    }

    public int getJ() {
      return j;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return i == pair.i &&
          j == pair.j;
    }

    @Override
    public int hashCode() {
      return Objects.hash(i, j);
    }
  }

  public int findPairs(int[] nums, int k) {
    int count = 0;

    Set<Pair> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        int tmp = nums[i] - nums[j];
        if (tmp < 0) {
          tmp = -(tmp);
        }
        if (tmp == k) {
          if(!set.contains(new Pair(nums[i], nums[j])) && !set.contains(new Pair(nums[j], nums[i])) ) {
            set.add(new Pair(nums[i], nums[j]));
          }
        }
      }
    }

    return set.size();
  }
}
