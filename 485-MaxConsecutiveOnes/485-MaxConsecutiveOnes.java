// Last updated: 7/8/2026, 3:39:43 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1) count=0;
            else count++;
           max=Math.max(count,max);

        }
        return max;
        
    }
}