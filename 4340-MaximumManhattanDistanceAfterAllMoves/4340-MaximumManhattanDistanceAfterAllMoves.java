// Last updated: 7/8/2026, 3:31:42 PM
class Solution {
    public int maxDistance(String moves) {
        int l=0,r=0,u=0,d=0,k=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') u++;
            else if(moves.charAt(i)=='D') d++;
            else if(moves.charAt(i)=='L') l++;
            else if(moves.charAt(i)=='R') r++;
            else k++;
            
        }
        int sum=(int)Math.abs(l-r)+(int)Math.abs(u-d)+k;
        return sum;
        
    }
}