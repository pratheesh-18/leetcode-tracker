// Last updated: 7/8/2026, 3:34:51 PM
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int n:nums){
            if(n>0) pos++;
            else if(n<0) neg++;
        }
        return pos>neg?pos:neg;
        
    }
}