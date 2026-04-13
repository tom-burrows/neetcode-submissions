class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];

        for (int i = 0; i < ans.length; i++) {
            if (i >= n) {
                ans[i] = nums[i-n];
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}