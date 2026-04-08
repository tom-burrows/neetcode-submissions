class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> cur = new HashSet<>();
        int l = 0;
        int longest = 0;

        for (int r = 0; r < s.length(); r++) {
            // iterates through each index with a l pointer and a rigt pointer
            // the right pointer updates, on each iteration.
            // the while loop inside the for will move the L pointer if and only if there
            // is a duplicate character in the set.
            // this will move the l character over
            // after this while loop ends, the value at r is added to the set of unique characters
            // then it checks whether the current longest value is less than the current substring
            // this happens at r in the string.
            while (cur.contains(s.charAt(r))) {
                cur.remove(s.charAt(l));
                l++;
            }
            cur.add(s.charAt(r));
            longest = Math.max(longest, r - l + 1);
        }

        return longest;
        
    }
}
