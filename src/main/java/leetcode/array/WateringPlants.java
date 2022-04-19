package leetcode.array;

public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int curCap = capacity;
        int step = 1;
        for(int i=0; i<plants.length; ) {
            if (plants[i] <= curCap) {
                curCap -= plants[i];
                ans++;
                step++;
                i++;
            } else {
                ans += (step-1);
                curCap = capacity;
                ans += (step-1);
            }
        }
        return ans;
    }
}
