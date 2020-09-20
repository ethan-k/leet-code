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
}
