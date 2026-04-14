class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int cur = 0, longest = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cur++;
            } else {
                longest = Math.max(longest, cur);
                cur = 0;
            }
        }
        return Math.max(longest, cur);
        
    }
}