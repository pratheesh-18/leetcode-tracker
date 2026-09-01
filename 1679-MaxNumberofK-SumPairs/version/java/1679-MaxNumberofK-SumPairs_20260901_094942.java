// Last updated: 9/1/2026, 9:49:42 AM
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int i=0;
5        int j=nums.length-1;
6        int count=0;
7        while(i<j){
8            int sum=nums[i]+nums[j];
9            if(sum==k){
10                 count++;
11                 i++;
12                 j--;
13            }
14            else if(sum>k) j--;
15            else i++;
16
17        }
18        return count;
19    }
20}