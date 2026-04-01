class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> operations = new HashSet<>();

        int result = 0, a = 0, b = 0;

        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < tokens.length; i++) {
            if (!operations.contains(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                b = stack.pop();
                a = stack.pop();

                switch (tokens[i]) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    case "-":

                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                }
            }
            
        }
        return stack.peek();
    }
}
