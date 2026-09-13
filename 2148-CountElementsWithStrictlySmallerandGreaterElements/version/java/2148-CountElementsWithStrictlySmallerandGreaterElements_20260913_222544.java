// Last updated: 9/13/2026, 10:25:44 PM
1class Solution {
2    public int countElements(int[] nums) {
3        Arrays.sort(nums);
4        int count=0;
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>nums[0] && nums[i]<nums[nums.length-1]) count++;
7        }
8        return count;
9        
10    }
11}