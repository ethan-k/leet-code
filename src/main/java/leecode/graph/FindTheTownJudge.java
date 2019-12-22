package leecode.graph;

public class FindTheTownJudge {
  public static void main(String[] args) {

  }

  public int findJudge(int N, int[][] trust) {
    int[][] g = new int[N+1][2];

    for(int[] arr: trust) {
      g[arr[0]][0]++;
      g[arr[1]][1]++;
    }

    for(int i=1;i<g.length;i++) {
      if (g[i][1] == N -1 && g[i][0] == 0) {
        return i;
      }
    }
    return -1;
  }
}
