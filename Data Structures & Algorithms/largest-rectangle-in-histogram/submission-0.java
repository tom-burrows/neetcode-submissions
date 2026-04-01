class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftBoundary = new int[n];
        int[] rightBoundary = new int[n];

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++){ 
            leftBoundary[i] = -1;
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                leftBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            rightBoundary[i] = n;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rightBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            leftBoundary[i] += 1;
            rightBoundary[i] -= 1;

            maxArea = Math.max(maxArea, heights[i] * (rightBoundary[i] - leftBoundary[i] + 1));
        }
        return maxArea;
        
    }
}
