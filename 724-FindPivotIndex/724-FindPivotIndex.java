// Last updated: 7/8/2026, 3:38:52 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
            right=total-left-nums[i];
            if(left==right) return i;
            else left+=nums[i];

        }
        return -1;
        
    }
}