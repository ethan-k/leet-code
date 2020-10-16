package leetcode.array;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    int n = nums.length;

    int[] tmp = new int[n];

    for (int i = 0; i < nums.length; i++) {
      tmp[(i + k) % n] = nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      nums[i] = tmp[i];
    }
  }

  public void rotateWithConstantSpace(int[] nums, int k) {

    k = k % nums.length;
    if (k == 0) {
      return;
    }

    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);

  }

  public void reverse(int[] nums, int start, int end) {
    while(start<=end) {
      int tmp = nums[end];
      nums[end] = nums[start];
      nums[start] = tmp;
      start++;
      end--;
    }
  }
}
