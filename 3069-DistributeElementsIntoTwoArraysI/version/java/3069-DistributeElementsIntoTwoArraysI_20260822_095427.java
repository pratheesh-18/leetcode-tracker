// Last updated: 8/22/2026, 9:54:27 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        ArrayList<Integer> arr1=new ArrayList<>();
4        ArrayList<Integer> arr2=new ArrayList<>();
5
6        arr1.add(nums[0]);
7        arr2.add(nums[1]);
8        for(int i=2;i<nums.length;i++){
9            int last1=arr1.get(arr1.size()-1);
10            int last2=arr2.get(arr2.size()-1);
11            if(last1>last2) arr1.add(nums[i]);
12            else arr2.add(nums[i]);
13        }
14        int[] res=new int[nums.length];
15        int ind=0;
16        for(int v:arr1) res[ind++]=v;
17        for(int v:arr2) res[ind++]=v;
18        return res;
19        
20        
21    }
22}