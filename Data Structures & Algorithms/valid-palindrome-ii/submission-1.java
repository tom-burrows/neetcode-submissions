class Solution {
    public boolean validPalindrome(String s) {
        boolean del = false;

        int l = 0, r = s.length()-1;
        // This doesn't work with the current test case, because e is at the start and the end
        // but you still need to delete one of the E's to make it work.
        while (l < r) {
            if ( s.charAt(l) != s.charAt(r)) {
                if ( del == true) {
                    return false;
                }
                String delRString = s.substring(0, r) + s.substring(r + 1);
                String delLString = s.substring(0, l) + s.substring(l + 1);
                System.out.println("Del R: " + delRString);
                System.out.println("Del L: " + delLString);

                return isPalindrome(delRString) || isPalindrome(delLString);
            } 
            r--;
            l++;
        }
        return true;
        
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while ( l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}