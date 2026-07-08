// Last updated: 7/8/2026, 3:43:14 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                r=mid-1;
               
            } 
            else {
                l=mid+1;
              
            }
        }
        return l;
        
    }
}