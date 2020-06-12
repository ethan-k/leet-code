package leecode.array;

public class ShuffleTheArray {
  public int[] shuffle(int[] nums, int n) {
    int[] ret = new int[nums.length];
    int i = 0, k = 0;
    while (k < (2 * n)) {
      ret[k] = nums[i];
      ret[k + 1] = nums[n + i];
      i++;
      k = k + 2;
    }
    return ret;
  }
}
