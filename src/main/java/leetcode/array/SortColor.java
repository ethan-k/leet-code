package leetcode.array;

public class SortColor {
  public void sortColors(int[] nums) {
    int[] count = new int[3];
    for (int num : nums) {
      count[num]++;
    }

    int right = nums.length - 1;
    while (right >= 0) {
      if (count[2] != 0) {
        nums[right--] = 2;
        count[2]--;
      } else if (count[1] != 0) {
        nums[right--] = 1;
        count[1]--;
      } else {
        nums[right--] = 0;
      }
    }
  }
}
