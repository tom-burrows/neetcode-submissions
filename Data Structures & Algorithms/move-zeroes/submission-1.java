class Solution {
    public void moveZeroes(int[] nums) {
        int r = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                r = i;
                while (nums[r] == 0 && r < nums.length-1) {
                    r++;
                }
                int copy = nums[r];
                nums[r] = 0;
                nums[i] = copy;
            }
        }
    }
}