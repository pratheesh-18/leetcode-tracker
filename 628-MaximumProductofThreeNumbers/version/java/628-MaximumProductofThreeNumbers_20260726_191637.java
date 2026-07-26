// Last updated: 7/26/2026, 7:16:37 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int max=1;
6        for(int i=0;i<nums.length;i++){
7            max=Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
8        }
9        return max;
10        
11    }
12}