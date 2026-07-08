// Last updated: 7/8/2026, 3:33:13 PM
class Solution {
    public double minimumAverage(int[] nums) {
        double min=Double.MAX_VALUE;
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l<r){
            double avg=(double)(nums[l]+nums[r])/2;
            min=avg<min?avg:min;
            l++;
            r--;
        
        }
        
        return min;

        
    }
}