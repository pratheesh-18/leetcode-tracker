// Last updated: 7/8/2026, 3:40:47 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int prodr=1;
        int prodl=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=prodr;
            prodr=prodr*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            result[i]*=prodl;
            prodl=prodl*nums[i];
        }
       return result;
        
    }
}