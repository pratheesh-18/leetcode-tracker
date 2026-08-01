// Last updated: 8/1/2026, 9:44:03 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int n=nums.length;
4        int[][] dp=new int[n][n];
5         for (int[] r : dp) 
6            Arrays.fill(r, -1);
7        return maxDiff(0, n - 1, nums, dp) >= 0;    
8        
9    }
10    private int maxDiff(int i, int j, int[] A, int[][] dp) {
11        if (dp[i][j] != -1) return dp[i][j];        
12        if (i == j) return dp[i][j] = A[i];
13        
14        return dp[i][j] = Math.max(
15            A[i] - maxDiff(i + 1, j, A, dp),
16            A[j] - maxDiff(i, j - 1, A, dp)
17        );
18    }
19}