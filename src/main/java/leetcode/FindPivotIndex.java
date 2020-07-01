package leetcode;

import java.util.LinkedList;

public class FindPivotIndex {
	public static void main(String[] args) {
		int[] input = {-1,-1,0,0,-1,-1};
		new FindPivotIndex().pivotIndex(input);
	}
	public int pivotIndex(int[] nums) {
		if (nums.length < 3) {
			return -1;
		}
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum+=nums[j];
			}

			for (int k = i+1; k < nums.length; k++) {
				rightSum+=nums[k];
			}
			if (leftSum == rightSum) {
				linkedList.add(i);
			}
		}
		if (linkedList.size() > 0) {
			return linkedList.getFirst();
		}
		return -1;

	}
}
