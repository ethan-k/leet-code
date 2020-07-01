package leetcode;

public class TeemoAttacking {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if (timeSeries.length == 0) {
			return 0;
		}
		int result = duration;
		for(int i = 1; i < timeSeries.length; i++) {
			if(timeSeries[i] -  timeSeries[i - 1] -1 < duration) {
				result += timeSeries[i] -  timeSeries[i - 1];
			} else {
				result += duration;
			}
		}
		return result;
	}
}
