class Solution {
    public int maxArea(int[] heights) {

        int largest = 0;
        int l = 0; int r = heights.length-1;
        int diff = 0, area = 0;

        while (l < r) {
            diff = r - l;

            if (heights[l] < heights[r]) {
                area = heights[l] * diff;
                l++;
            } else {
                area = heights[r] * diff;
                r--;
            }
            
            if (area > largest) largest = area;

        }
        
        return largest;

        
        
    }
}
