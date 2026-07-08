// Last updated: 7/8/2026, 3:32:42 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int n:nums){
            sum+=n;

        }
   

       return sum%k; 
    }
}