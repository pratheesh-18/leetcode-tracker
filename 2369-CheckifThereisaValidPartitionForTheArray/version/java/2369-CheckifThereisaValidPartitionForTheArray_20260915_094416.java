// Last updated: 9/15/2026, 9:44:16 AM
1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        long count=0;
4        int left=0;
5        long sum=0;
6        for(int right=0;right<nums.length;right++){
7             sum+=nums[right];
8            while(sum*(right-left+1)>=k){
9                sum-=nums[left++];
10                
11            }
12            count+=right-left+1;
13        }
14        return count;
15        
16    }
17}