// Last updated: 7/8/2026, 3:41:23 PM
class Solution {
    public int titleToNumber(String col) {
        int ans=0;
        for(int i=0;i<col.length();i++){
            ans=(ans*26)+(col.charAt(i)-64);  

        }
        return ans;
        
    }
}