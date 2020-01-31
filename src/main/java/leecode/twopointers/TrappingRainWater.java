package leecode.twopointers;

public class TrappingRainWater {
  public int trap(int[] heights) {
    if (heights == null || heights.length == 0) {
      return 0;
    }

    int highestBarIndex = 0;
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] > heights[highestBarIndex]) {
        highestBarIndex = i;
      }
    }

    int water = 0;
    int leftMax = heights[0];
    for (int i = 1; i < highestBarIndex; i++) {
      if (heights[i] > leftMax) {
        leftMax = heights[i];
      } else {
        water += leftMax - heights[i];
      }
    }

    int rightMax = heights[heights.length - 1];
    for (int j = heights.length - 1; j > highestBarIndex; j--) {
      if (heights[j] > rightMax) {
        rightMax = heights[j];
      } else {
        water += rightMax - heights[j];
      }
    }
    return water;
  }
}
