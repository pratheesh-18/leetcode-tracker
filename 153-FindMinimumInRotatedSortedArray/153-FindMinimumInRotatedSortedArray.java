// Last updated: 7/8/2026, 3:41:35 PM
class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[l]<=nums[r]){
                 ans=Math.min(ans,nums[l]);
                break;
            }
            else if(nums[mid]<nums[l]){
                ans=Math.min(ans,nums[mid]);
                r=mid-1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                l=mid+1;
            }


            
        }
        return ans;
        
    }
}