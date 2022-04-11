package leetcode.array;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ret = new int[2*n];

        for(int i=0; i<nums.length; i++) {
            ret[i] = nums[i];
            ret[i+n] = nums[i];
        }
        return ret;
    }
}
