package leetcode.array;

public class GasStation {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    for (int i = 0; i < gas.length; i++) {
      if (canCompleteCircuit(i, i + 1, gas[i], gas, cost, new boolean[gas.length])) {
        return i;
      }
    }
    return -1;
  }

  boolean canCompleteCircuit(int prev, int i, int curGas, int[] gas, int[] cost, boolean[] visited) {
    i = i % gas.length;

    if (visited[i])
      return true;

    if (curGas < cost[prev])
      return false;

    curGas = curGas + gas[i] - cost[prev];
    visited[i] = true;
    return canCompleteCircuit(i, i + 1, curGas, gas, cost, visited);
  }
}
