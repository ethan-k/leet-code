package leecode.greedy;

public class DeleteColumnsToMakeSorted {
  public static void main(String[] args) {
    String[] input1 = new String[] {"cba","daf","ghi"};
    String[] input2 = new String[] {"a","b"};
    String[] input3 = new String[] {"zyx","wvu","tsr"};

    System.out.println(minDeletionSize(input1));
    System.out.println(minDeletionSize(input2));
    System.out.println(minDeletionSize(input3));

  }
  public static int minDeletionSize(String[] A) {
    int count = 0;
    int rowLength = A.length;
    int columnlength = A[0].length();

    for (int i = 0; i < columnlength; i++) {
      boolean find = true;
      for (int j = 0; j < rowLength - 1; j++) {
        if (A[j].charAt(i) > A[j + 1].charAt(i)) {
          find = false;
          break;
        }
      }
      if (!find) {
        count++;
      }
    }
    return count;
  }
}
