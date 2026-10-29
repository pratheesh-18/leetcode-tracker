// Last updated: 10/29/2026, 10:52:24 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int n=obstacleGrid.length;
4        int m=obstacleGrid[0].length;
5        int [][] dp=new int[n][m];
6        if(obstacleGrid[0][0]==1){
7            return 0;
8        }
9        dp[0][0]=1;
10        for(int i=1;i<n;i++){
11            if(obstacleGrid[i][0]==0){
12                dp[i][0]=dp[i-1][0];
13            }
14        }
15        for(int i=1;i<m;i++){
16            if(obstacleGrid[0][i]==0){
17                dp[0][i]=dp[0][i-1];
18            }
19        }
20        for(int i=1;i<n;i++){
21            for(int j=1;j<m;j++){
22                if(obstacleGrid[i][j] == 1) {
23                    dp[i][j] = 0;
24                } else {
25                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
26                }
27            }
28        }
29        return dp[n-1][m-1];
30    }
31}