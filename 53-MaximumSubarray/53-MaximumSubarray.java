// Last updated: 7/8/2026, 3:42:56 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);  
            max = Math.max(max, sum);
        }
        
        return max;

        
    }
}