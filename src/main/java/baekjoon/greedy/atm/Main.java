package baekjoon.greedy.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfPeople = Integer.parseInt(sc.nextLine());
    String timesForWithDraw = sc.nextLine();

    String[] values = timesForWithDraw.split(" ");

    System.out.println(findSum(numberOfPeople, values));

  }

  static int findSum(int numOfPeople, String[] values) {
    List<Integer> list = new ArrayList<>();
    for (String value : values) {
      list.add(Integer.parseInt(value));
    }
    list.sort(Integer::compareTo);
    int sum = 0;
    int currentWaitingTime = 0;
    for (Integer integer : list) {
      currentWaitingTime += integer;
      sum += currentWaitingTime;
    }
    return sum;
  }
}
