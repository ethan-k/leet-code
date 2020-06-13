package leecode.bit;

public class NumberofStepstoReduceaNumbertoZero {
  public int numberOfSteps(int num) {
    int totalSteps = 0;

    while (num != 0) {
      if (num % 2 == 0) {
        num = num / 2;
      } else {
        num = num - 1;
      }
      totalSteps++;
    }

    return totalSteps;
  }
}
