// Last updated: 9/17/2026, 9:51:25 AM
1class Solution {
2    public boolean isPossibleDivide(int[] nums, int k) {
3        int n=nums.length;
4        if(n%k!=0) return false;
5        TreeMap<Integer,Integer> map=new TreeMap<>();
6        for(int num:nums){
7            map.put(num,map.getOrDefault(num,0)+1);
8        }
9        while(!map.isEmpty()){
10            int first=map.firstKey();
11            for(int i=0;i<k;i++){
12                int curr=first+i;
13                if(!map.containsKey(curr)) return false;
14
15                int count=map.get(curr);
16                if(count==1) map.remove(curr);
17                else{
18                    map.put(curr,count-1);
19                }
20            }
21        }
22        return true;
23        
24    }
25}