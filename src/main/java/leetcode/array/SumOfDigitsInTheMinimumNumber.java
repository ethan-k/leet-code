package leetcode.array;

public class SumOfDigitsInTheMinimumNumber {
  public int sumOfDigits(int[] A) {
    int[] container = new int[101];

    for (int n : A) {
      container[n] = n;
    }

    for (int n : container) {
      if (n != 0) {
        int total = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); ++i) {
          total += num.charAt(i) - '0';
        }

        return total % 2 == 0 ? 1 : 0;
      }
    }
    return 0;
  }
}
