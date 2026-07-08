// Last updated: 7/8/2026, 3:36:53 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        int[] res=new int[nums.length];
        res[nums.length-1]=total;
        for(int i=nums.length-2;i>=0;i--){
            total-=nums[i+1];
            res[i]=total;

        }
        return res;
        
    }
}