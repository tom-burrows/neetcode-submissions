class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length()-1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if ( a > b ) { 
                score += a - b;
            } else {
                score += b - a;
            }
        }
        return score;
    }
}