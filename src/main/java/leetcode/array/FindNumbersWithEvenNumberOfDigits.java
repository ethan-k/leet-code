package leetcode.array;

public class FindNumbersWithEvenNumberOfDigits {
  public int findNumbers(int[] nums) {
    int ret = 0;
    for (int num : nums) {
      if (String.valueOf(num).length() % 2 == 0) {
        ret++;
      }
    }
    return ret;
  }
}
