class Solution {
    public int search(int[] nums, int target) {
        int res = nums[0];
        int l = 0, r = nums.length - 1;

        while ( l < r) {
            int mid = (l + r) / 2;

            if ( nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }  
        int pivot = l;

        int result = binarySearch(nums, 0, pivot-1, target);
        if ( result != -1) return result;

        return binarySearch(nums, pivot, nums.length-1, target);
    }
    private int binarySearch(int[] arr, int low, int high, int x) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            }

            return binarySearch(arr, mid+1, high, x);
        }

        return -1;
    }
}
