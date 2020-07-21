package leetcode.array;

public class LargestRectangleInHistogram {
  public int largestRectangleArea(int[] heights) {

    int n = heights.length;
    int[] maxWidth = new int[n];

    for (int i = 0; i < n; i++) {
      int width = 1;
      int right = i + 1;
      int left = i - 1;
      while (right < n && heights[right] >= heights[i]) {
        width++;
        right++;
      }
      while (left >= 0 && heights[left] >= heights[i]) {
        width++;
        left--;
      }
      maxWidth[i] = width;
    }

    int maxArea = 0;

    for (int i = 0; i < n; i++) {
      maxArea = Math.max(maxArea, heights[i] * maxWidth[i]);
    }

    return maxArea;
  }
}
