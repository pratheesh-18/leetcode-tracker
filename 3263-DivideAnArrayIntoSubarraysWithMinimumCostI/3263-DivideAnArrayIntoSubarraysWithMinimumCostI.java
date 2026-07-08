// Last updated: 7/8/2026, 3:33:24 PM
class Solution {
    public int minimumCost(int[] nums) {
        int first=nums[0];
        Arrays.sort(nums,1,nums.length);
        return first+nums[1]+nums[2];
        
    }
}