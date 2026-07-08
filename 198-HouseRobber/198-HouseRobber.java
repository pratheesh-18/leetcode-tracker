// Last updated: 7/8/2026, 3:41:11 PM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length-1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        helper(n,nums,dp);
        return dp[n];
    }
    public static int helper(int n,int[] nums,int[] dp){
        if(n<0){
            return 0;
        };
      
        if(dp[n]!=-1) return dp[n];
        else {
            dp[n]=Math.max(nums[n]+helper(n-2,nums,dp),0+helper(n-1,nums,dp));
            return dp[n];
        }
    }
}