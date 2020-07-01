package leetcode.twopointers;

public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int ret = 0;
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      if (nums[i] == val) {
        while (j < nums.length) {
          if (nums[j] != val) {
            break;
          }
          j++;
        }
        if (j < nums.length) {
          ret++;
          int tmp = nums[i];
          nums[i] = nums[j];
          nums[j] = tmp;
      }
    } else {
        ret++;
      }
    }

    return ret;
  }
}
