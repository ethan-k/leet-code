package leetcode;

public class TribonacciNumber {


  public static void main(String[] args) {
    System.out.println(new TribonacciNumber().tribonacci(37));
  }

  private int[] numbers = new int[38];

  public int tribonacci(int n) {

    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 1;
    }
    if (numbers[n] != 0) {
      return numbers[n];
    }

    return numbers[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
  }
}
