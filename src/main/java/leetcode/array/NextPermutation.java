package leetcode.array;

public class NextPermutation {
  public void nextPermutation(int[] nums) {


    int n = nums.length;
    int left = n - 2;
    while (left >= 0 && nums[left] >= nums[left + 1]) {
      left--;
    }

    if (left >= 0) {
      int right = n - 1;

      while (right > left && nums[right] <= nums[left]) {
        right--;
      }
      swap(left, right, nums);
    }
    reverse(left + 1, nums);
  }

  void swap(int i, int j, int[] nums) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  void reverse(int start, int[] nums) {
    int end = nums.length - 1;

    while (start < end) {
      swap(start, end, nums);
      start++;
      end--;
    }
  }
}
