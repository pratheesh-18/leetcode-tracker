// Last updated: 7/8/2026, 3:32:52 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int left=0;
        int count=0;
        for(int i=0;i<=nums.length-2;i++){
            left+=nums[i];
            sum-=nums[i];
            if((left-sum)%2==0) count++;
        }
        return count;
    }
}