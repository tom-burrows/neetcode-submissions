class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketType = new HashMap<>();

        bracketType.put('(', ')');
        bracketType.put('[', ']');
        bracketType.put('{', '}');

        for (char cur : s.toCharArray()) {

            if (bracketType.containsKey(cur)) {
                stack.push(cur);
                continue;
            }

            if (stack.isEmpty()){
                return false;
            }
            if(cur == bracketType.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }

        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
        
    }
}
