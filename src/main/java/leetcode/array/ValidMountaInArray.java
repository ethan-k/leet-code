package leetcode.array;

public class ValidMountaInArray {
  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3)
      return false;

    int peak = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[peak] < arr[i]) {
        peak = i;
      }
    }

    if (peak == arr.length - 1 || peak == 0)
      return false;

    for (int i = 0; i < peak; i++) {
      if (arr[i] >= arr[i + 1])
        return false;
    }

    for (int i = peak + 1; i < arr.length; i++) {
      if (arr[i - 1] <= arr[i])
        return false;
    }
    return true;
  }
}
