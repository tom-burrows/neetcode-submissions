class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();
        
        for (String str : strs) {
            int[] stringValue = new int[26];
            for ( char c : str.toCharArray()) {
                stringValue[c - 'a']++;
            }

            String key = Arrays.toString(stringValue);
            
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(str);
        }

        return new ArrayList<>(group.values());
    }
}
