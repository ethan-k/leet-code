package leetcode.array;

public class DecompressRunLengthEncodedList {
  public int[] decompressRLElist(int[] nums) {
    int totalFreq = 0;
    for (int i = 0; i < nums.length; i = i + 2) {
      totalFreq += nums[i];
    }

    int[] ret = new int[totalFreq];
    int startIndex = 0;
    for (int i = 0; i < nums.length; i = i + 2) {
      int freq = nums[i];
      int val = nums[i + 1];
      int x = 0;
      while (x < freq) {
        ret[startIndex++] = val;
        x++;
      }
    }

    return ret;
  }
}
