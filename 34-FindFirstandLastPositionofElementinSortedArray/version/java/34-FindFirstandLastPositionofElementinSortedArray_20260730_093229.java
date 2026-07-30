// Last updated: 7/30/2026, 9:32:29 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        boolean searchleft=true;
4        int first=firstOccurance(nums,target,searchleft);
5        if(first==-1) return new int[]{-1,-1};
6        searchleft=false;
7        int last=firstOccurance(nums,target,searchleft);
8return  new int[]{first,last};
9    }
10
11    public static int firstOccurance(int[] nums,int target,boolean leftsearch){
12        int l=0,r=nums.length-1;
13        int ans=-1;
14        while(l<=r){
15            int mid=(l+r)/2;
16            if(nums[mid]==target){
17                ans=mid;
18                if(leftsearch)
19                    r=mid-1;
20                else l=mid+1;
21            }
22            else if(nums[mid]>target){
23                r=mid-1;
24            }
25            else{
26                l=mid+1;
27            }
28        }
29        return ans;
30    }
31   
32    
33}