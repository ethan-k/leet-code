package leecode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);

    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] > 0) break;
      int leftIdx = i + 1;
      int rightIdx = nums.length - 1;
      if (i == 0 || nums[i] != nums[i - 1]) {
        while (leftIdx < rightIdx) {
          int curSum = nums[i] + nums[leftIdx] + nums[rightIdx];
          if (curSum == 0) {
            triplets.add(Arrays.asList(nums[i], nums[leftIdx], nums[rightIdx]));
            while (leftIdx < rightIdx && nums[leftIdx] == nums[leftIdx + 1]) leftIdx++;
            while (leftIdx < rightIdx && nums[rightIdx] == nums[rightIdx - 1]) rightIdx--;
            leftIdx++;
            rightIdx--;
          } else if (curSum < 0) {
            leftIdx++;
          } else {
            rightIdx--;
          }
        }
      }
    }
    return triplets;
  }
}
