// Last updated: 7/8/2026, 3:31:34 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxLeft=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
            maxLeft = Math.max(maxLeft, nums[i - k]);
            ans = Math.max(ans, maxLeft + nums[i]);
        }
        return ans;
        
    }
}