class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];

        int runningMax = arr[arr.length-1];
        ans[arr.length-1] = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            ans[i] = runningMax;
            runningMax = Math.max(runningMax, arr[i]);
            
        }

        return ans;
        
    }
}