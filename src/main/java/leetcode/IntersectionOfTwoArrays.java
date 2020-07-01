package leetcode;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		for (int i : nums2) {
			arrayList2.add(i);
		}
		for (int i : nums1) {
			if(arrayList2.contains(i) && !result.contains(i)) {
				result.add(i);
			}
		}

		int[] resultArray = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}
		return resultArray;
	}

}
