// Last updated: 7/8/2026, 3:37:23 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int len=(int)Math.log10(n)+1;
            if(len%2==0) count++;
        }
        return count;
        
    }
}