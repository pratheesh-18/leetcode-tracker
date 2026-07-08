// Last updated: 7/8/2026, 3:33:17 PM
class Solution {
    public int scoreOfString(String s) {
        int score=0;
        int i=0,j=1;
        while(j<s.length()){
            score+=Math.abs((s.charAt(i)-s.charAt(j)));
            i++;
            j++;

        }
        return score;
        
    }
}