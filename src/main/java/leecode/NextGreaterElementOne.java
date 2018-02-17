package leecode;

import java.util.Arrays;
import java.util.OptionalInt;

public class NextGreaterElementOne {


	public static void main(String[] args) {
		int[] nums1 = {4, 1, 2};
		int[] nums2 = {1, 3, 4, 2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			final int index = i;
			final int needle = nums1[index];
			boolean found = false;
			int startingPoint = getArrayIndex(nums2, needle);
			for (int j = startingPoint; j < nums2.length; j++) {
				if (nums2[j] > needle) {
					result[i] = nums2[j];
					found = true;
					break;
				}
			}
			if (!found) {
				result[i] = -1;
			}
		}
		return result;
	}

	public static int getArrayIndex(int[] arr,int value) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==value) return i;
		return -1;
	}
}
