class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0, right = s.length() - 1;
        String leftStr = "", rightStr = "";

        while (left < right) {
            leftStr += s.charAt(left);
            rightStr += s.charAt(right);

            if (!rightStr.equals(leftStr)) {
                return false;
            }

            left++;
            right--;

            
        }
        return true;
        
    }
}
