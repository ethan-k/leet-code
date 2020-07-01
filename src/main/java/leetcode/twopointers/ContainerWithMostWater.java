package leetcode.twopointers;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {


    int ret = Integer.MIN_VALUE;

    for (int i = 0; i < height.length; i++) {
      for (int j = height.length - 1; j > i; j--) {
        ret = Math.max(ret, (j - i) * Math.min(height[i], height[j]));
      }
    }
    return ret;
  }

  public int maxArea2(int[] height) {

    int left = 0, right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
