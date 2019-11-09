package leecode.greedy;

import java.util.Arrays;

public class LemonadeChange {
  public static void main(String[] args) {
    int[] input1 = new int[]{5, 5, 5, 10, 20};
    int[] input2 = new int[]{5, 5, 10};
    int[] input3 = new int[]{10, 10};
    int[] input4 = new int[]{5, 5, 10, 10, 20};
    int[] input5 = new int[]{5, 5, 20, 5, 5, 10, 5, 10, 5, 20};
    int[] input6 = new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
    System.out.println(lemonadeChange(input1));
    System.out.println(lemonadeChange(input2));
    System.out.println(lemonadeChange(input3)); // false
    System.out.println(lemonadeChange(input4)); // false
    System.out.println(lemonadeChange(input5)); // false
    System.out.println(lemonadeChange(input6)); // true

  }

  public static boolean lemonadeChange(int[] bills) {
    int[] bill = new int[3];

    for (int b : bills) {

      if (b == 5) {
        ++bill[0];
      }
      if (b == 10) {
        --bill[0];
        ++bill[1];
      }
      if (b == 20) {
        if (bill[1] >= 1) {
          --bill[1];
          b -= 10;
        }
        while (b != 5) {
          b -= 5;
          --bill[0];
        }
      }
      for (int count : bill) {
        if (count < 0) {
          return false;
        }
      }
    }

    return true;
  }
}
