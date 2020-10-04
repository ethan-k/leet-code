package leetcode.array;

import java.util.Arrays;

public class KDiffPairsInAnArray {
  public static void main(String[] args) {
    int[] input = new int[]{1, 1, 1, 2, 1};
    System.out.println(new KDiffPairsInAnArray().findPairs(input, 1));
  }

  public int findPairs(int[] nums, int k) {

    int total = 0;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i - 1] == nums[i]) {
        continue;
      }
      if (binarySearch(nums, i + 1, nums[i] + k)) {
        total++;
      }
    }

    return total;
  }

  public boolean binarySearch(int[] nums, int start, int target) {
    int right = nums.length - 1;
    int left = start;

    while (left <= right) {
      int middle = left + (right - left) / 2;
      if (nums[middle] == target) {
        return true;
      } else if (nums[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    return false;

  }
}
