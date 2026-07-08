// Last updated: 7/8/2026, 3:33:37 PM
class Solution {

    public static int helper(int n, List<Integer> nums, int sum, int[][] dp) {

        if(sum == 0)
            return 0;

        if(n == 0)
            return Integer.MIN_VALUE;

        if(dp[n][sum] != -1)
            return dp[n][sum];

        int take = Integer.MIN_VALUE;

        if(nums.get(n - 1) <= sum) {

            int res = helper(n - 1, nums, sum - nums.get(n - 1), dp);

            if(res != Integer.MIN_VALUE)
                take = 1 + res;
        }

        int nottake = helper(n - 1, nums, sum, dp);

        dp[n][sum] = Math.max(take, nottake);

        return dp[n][sum];
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int n = nums.size();

        int[][] dp = new int[n + 1][target + 1];

        for(int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = helper(n, nums, target, dp);

        return ans < 0 ? -1 : ans;
    }
}