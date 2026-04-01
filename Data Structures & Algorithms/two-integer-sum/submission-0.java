class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visited = new HashMap<>();

        for ( int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (visited.containsKey(difference)) {
                int[] result = {visited.get(difference), i};
                return result;
            } else {
                visited.put(nums[i], i);
            }
        }
        return nums;
    }
}
