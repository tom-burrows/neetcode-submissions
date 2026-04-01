class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                Integer value = sMap.get(s.charAt(i));
                value++;
                sMap.put(s.charAt(i), value);
            } else {
                sMap.put(s.charAt(i), 0);
            }
            
            if (tMap.containsKey(t.charAt(i))) {
                Integer value = tMap.get(t.charAt(i));
                value++;
                tMap.put(t.charAt(i), value);
            } else {
                tMap.put(t.charAt(i), 0);
            }
        }

        return sMap.equals(tMap);
    }
}
