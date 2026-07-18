// Last updated: 7/18/2026, 10:00:30 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums[0],b=nums[nums.length-1];
5        while(b!=0){
6            int t=b;
7            b=a%b;
8            a=t;
9        }
10        return a;
11    }
12}