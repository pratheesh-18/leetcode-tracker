// Last updated: 8/2/2026, 9:05:26 AM
1class Solution {
2    public boolean stoneGame(int[] piles) {
3        int n=piles.length;
4        int dp[][]=new int[n][n];
5        for(int[] r:dp){
6            Arrays.fill(r,-1);
7        }
8        return helper(0,n-1,piles,dp)>0;
9        
10    }
11    public static int helper(int i,int j,int[] piles,int[][] dp){
12        if(i==j) return dp[i][j]=piles[i];
13        if(dp[i][j]!=-1) return dp[i][j];
14        int left=piles[i]-helper(i+1,j,piles,dp);
15        int right=piles[j]-helper(i,j-1,piles,dp);
16        return dp[i][j]=Math.max(left,right);
17    }
18}