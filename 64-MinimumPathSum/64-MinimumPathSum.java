// Last updated: 7/8/2026, 3:42:44 PM
class Solution {

    public int helper(int i, int j, int m, int n, int[][] grid, int[][] dp) {

        if(i == m - 1 && j == n - 1)
            return grid[i][j];

        if(i >= m || j >= n)
            return Integer.MAX_VALUE;

        if(dp[i][j] != -1)
            return dp[i][j];

        int down = helper(i + 1, j, m, n, grid, dp);
        int right = helper(i, j + 1, m, n, grid, dp);

        int minPath = Math.min(down, right);

        if(minPath == Integer.MAX_VALUE)
            return dp[i][j] = Integer.MAX_VALUE;

        return dp[i][j] = grid[i][j] + minPath;
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, m, n, grid, dp);
    }
}