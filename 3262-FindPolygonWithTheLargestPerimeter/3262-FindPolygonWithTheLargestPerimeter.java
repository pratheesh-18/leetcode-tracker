// Last updated: 7/8/2026, 3:33:26 PM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long[]pref=new long[n];
        pref[0]=nums[0];
        long sum=0, ans=-1;
        
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        for(int i=2;i<n;i++){
            if(pref[i-1]>nums[i]){
                  ans=pref[i];
            }
            

        }
       return ans;
        
        
    }
}