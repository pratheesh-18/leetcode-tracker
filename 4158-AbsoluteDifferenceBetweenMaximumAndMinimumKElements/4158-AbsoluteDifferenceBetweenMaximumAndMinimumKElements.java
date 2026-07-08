// Last updated: 7/8/2026, 3:32:18 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxSum=0;
        int minSum=0;
        for(int i=0;i<k;i++){
            minSum+=nums[i];
            maxSum+=nums[n-i-1];

        }
        return Math.abs(maxSum-minSum);
        
    }
}