package leetcode.array;


class FindMinimumInRotatedSortedArray {
   int findPivot(int[] nums, int left, int right) {
        if (nums[left] < nums[right])
            return 0;
        
        while(left <= right) {
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[mid+1]) {
                return mid + 1;
            } else {
                 if (nums[mid] < nums[left])
                  right = mid - 1;
                else
                  left = mid + 1;
            } 
        }
        
        return 0;
        
    }
    
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        int n = nums.length;
        int pivot = findPivot(nums, 0, n-1); 
        
        return nums[pivot];
    }
}