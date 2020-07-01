package leetcode;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		// When i is a, find b > a or eles
		int[] result = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			for (int j = i + 1; j < temperatures.length; j++) {
				if(temperatures[i] < temperatures[j]) {
					result[i] = j - i;
					break;
				}
			}
		}
		return result;
	}
}
