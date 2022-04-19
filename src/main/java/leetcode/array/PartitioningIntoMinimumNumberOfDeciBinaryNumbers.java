package leetcode.array;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {

        int ans = 0;

        int[] nums = new int[n.length()];

        for(int i=0; i<n.length(); i++) {
            nums[i] = n.charAt(i) - '0';
        }

        int count = 0;
        while(!isZero(nums)) {
            count++;
            for(int i=0; i<n.length(); i++) {
                if (nums[i] >= 1) {
                    nums[i]--;
                }
            }

        }
        return count;
    }

    boolean isZero(int[] nums) {
        for(int num: nums) {
            if (num != 0)
                return false;
        }

        return true;

    }
}
