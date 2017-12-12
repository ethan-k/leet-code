package leecode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] input = {1,3,5,6};
		new SearchInsertPosition().searchInsert(input, 2);
	}
	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i])
				return i;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > target) {
				return i;
			}
			if (i == nums.length -1) {
				return nums.length;
			}
		}
		return 0;
	}
}
