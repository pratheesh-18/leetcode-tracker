// Last updated: 7/30/2026, 10:03:34 AM
1class Solution {
2    public boolean partitionArray(int[] nums, int k) {
3        int len=nums.length;
4        if(len%k!=0) return false;
5        Map<Integer,Integer> map=new HashMap<>();
6        for(int n:nums){
7            map.put(n,map.getOrDefault(n,0)+1);
8        }
9        for(Map.Entry<Integer,Integer> set:map.entrySet()){
10            if(set.getValue()>len/k) return false;
11        }
12        return true;
13
14        
15    }
16}