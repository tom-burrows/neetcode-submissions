class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];


        // for i in range, while stack != empty and the ith temp is > the top of stack
        // then pop the shit outta the bitch, subtracting the previous values from the current
        // index, and storing it in the result.

        // if the while loop doesn't trigger then that means that the temperatures are not
        // greater than, so you just pop it in the loop.
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                result[prev] = i - prev;
            }
            stack.push(i);
        }
        return result;
        
    }
}
