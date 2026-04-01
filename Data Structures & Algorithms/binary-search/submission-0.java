class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        
        return binarySearch(nums, low, high, target);
        
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                return binarySearch(nums, low, mid-1, target);
            } 

            return binarySearch(nums, mid+1, high, target);
            
        }
        return -1;
    }
}
