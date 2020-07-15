package leetcode.array;

class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length -1; 
        int left=0, right = nums.length -1; 
        int leftMost = -1;
        int rightMost = -1;
        
        while(left <= right) {
            
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                leftMost = mid;
                right--;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
        left=0;
        right = nums.length -1; 
        
        while(left <= right) {   
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                rightMost = mid;
                left++;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
        if (leftMost != -1 && rightMost != -1) {
            return new int[] {leftMost, rightMost};
        }
        
        return new int[] {-1, -1};
    }
}