package leecode.math;

public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(new PalindromeNumber().isPalindrome(121));
  }

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    char[] arr = String.valueOf(x).toCharArray();
    for (int i = 0; i < arr.length / 2; i++) {
      if (arr[i] != arr[arr.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
