// Last updated: 7/8/2026, 3:31:32 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        // int l=0,r=nums.length-1;
        // if(nums.length==1) return true;
       
            int mid=nums.length/2;
       
            for(int i=0;i<nums.length;i++){
                if (i != mid && nums[i] == nums[mid]) {
                return false;
            }
                
            }
       return true;
        
        
    }
}