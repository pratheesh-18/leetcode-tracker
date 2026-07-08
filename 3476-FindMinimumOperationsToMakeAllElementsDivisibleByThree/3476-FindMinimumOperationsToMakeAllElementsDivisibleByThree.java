// Last updated: 7/8/2026, 3:33:08 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0) count++;

        }
        return count;
        
    }
}