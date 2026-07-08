// Last updated: 7/8/2026, 3:39:00 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=nums[i];

        }

        double max=(double)currentsum/k;
    
        for(int i=k;i<nums.length;i++){
            currentsum+=nums[i]-nums[i-k];
            max=Math.max(max,(double)currentsum/k);
        }
        return max;
        
    }
}