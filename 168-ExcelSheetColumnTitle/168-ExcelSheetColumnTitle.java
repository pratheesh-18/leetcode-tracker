// Last updated: 7/8/2026, 3:41:26 PM
class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        int rem=0;
        while(col>0){
             rem=(col-1)%26;
             sb.append((char)('A'+rem));
             col=(col-1)/26;

        }
        return sb.reverse().toString();
        
    }
}