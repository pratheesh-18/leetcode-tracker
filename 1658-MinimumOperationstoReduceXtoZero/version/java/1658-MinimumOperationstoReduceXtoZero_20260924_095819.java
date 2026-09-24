// Last updated: 9/24/2026, 9:58:19 AM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int tot=0;
4        for(int n:nums){
5            tot+=n;
6        }
7        int target=tot-x;
8        if(target==0) return nums.length;
9        int left=0,sum=0;
10        int longest=-1;
11       for(int i=0;i<nums.length;i++){
12           sum+=nums[i];
13          while(sum>target  && left<=i){
14            sum-=nums[left++];
15          }
16          if(sum==target) longest=Math.max(longest,i-left+1);
17
18       }
19       return (longest==-1)?-1:nums.length-longest;
20        
21    }
22}