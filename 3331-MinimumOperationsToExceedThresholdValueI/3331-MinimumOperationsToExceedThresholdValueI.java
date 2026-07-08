// Last updated: 7/8/2026, 3:33:22 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int n:nums){
            if(n<k) count++;
        }
        return count;
        
    }
}