class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        List<Character> brackets = new ArrayList<>();
        HashMap<Character, Character> bracketType = new HashMap<>();

        bracketType.put('(', ')');
        bracketType.put('[', ']');
        bracketType.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            System.out.println(cur);
            if (bracketType.containsKey(cur)) {
                brackets.add(cur);
                continue;
            }

            if (brackets.isEmpty()){
                return false;
            }
            if(cur == bracketType.get(brackets.getLast())) {
                brackets.remove(brackets.size()-1);
            } else {
                return false;
            }

        }
        if (!brackets.isEmpty()) {
            return false;
        }
        return true;
        
    }
}
