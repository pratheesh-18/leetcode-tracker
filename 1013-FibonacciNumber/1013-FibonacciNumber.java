// Last updated: 7/8/2026, 3:38:32 PM
class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        helper(n,dp);
        return dp[n];
        
    }
    public static int helper(int n,int[] dp){
        if(n<=1){
            dp[n]=n;
            return n;
        } 
        if(dp[n]!=-1) return dp[n];
        else{
            dp[n]=helper(n-1,dp)+helper(n-2,dp);
            return dp[n];
        }
    }
}