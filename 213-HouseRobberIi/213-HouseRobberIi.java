// Last updated: 7/8/2026, 3:41:01 PM
class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        if (n == 1) return nums[0];
        int[] arr1 = new int[n - 1]; 
        int[] arr2 = new int[n - 1]; 

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = nums[i];
        }

        int[] dp1 = new int[arr1.length];
        Arrays.fill(dp1, -1);

        int[] dp2 = new int[arr2.length];
        Arrays.fill(dp2, -1);

        int ans1 = helper(arr1.length - 1, arr1, dp1);
        int ans2 = helper(arr2.length - 1, arr2, dp2);

        return Math.max(ans1, ans2);

        
    }
    public static int helper(int i,int[] nums,int[] dp){
         if (i < 0) return 0;
        if (i == 0) return nums[0];

        if (dp[i] != -1) return dp[i];

        int pick = nums[i] + helper(i - 2, nums, dp);
        int notPick = helper(i - 1, nums, dp);

        return dp[i] = Math.max(pick, notPick);
    }
}