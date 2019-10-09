package leecode;

public class DistanceBetweenBusStops {
  public static void main(String[] args) {
    int[] input = {1,2,3,4};
    System.out.println(new DistanceBetweenBusStops().distanceBetweenBusStops(input, 1, 2));;
  }

  public int distanceBetweenBusStops(int[] distance, int start, int destination) {
    int closeWiseSum = 0;

    int i = start;
    while (i != destination) {
      closeWiseSum += distance[i];
      i++;
      if (i == distance.length) {
        i = 0;
      }
    }
    int counterClockWiseSum = 0;
    i = destination;
    while (i != start) {
      counterClockWiseSum += distance[i];
      i++;
      if (i == distance.length) {
        i = 0;
      }
    }
    return Math.min(closeWiseSum, counterClockWiseSum);
  }
}
