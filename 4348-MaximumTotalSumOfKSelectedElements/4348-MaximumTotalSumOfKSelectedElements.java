// Last updated: 7/8/2026, 3:31:37 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
             if(mul>=1){
                 sum+=(long)mul*nums[n-i-1];
                 
             }
            else{
                sum+=nums[n-i-1];
            }
            mul--;
            
            
        }
        return sum;
        
    }
}