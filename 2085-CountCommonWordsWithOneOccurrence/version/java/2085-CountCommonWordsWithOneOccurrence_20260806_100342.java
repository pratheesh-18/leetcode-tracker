// Last updated: 8/6/2026, 10:03:42 AM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        HashMap<String ,Integer> map=new HashMap<>();
4        for(String s1:words1){
5            map.put(s1,map.getOrDefault(s1,0)+1);
6        }
7        for(String s2:words2){
8            if(map.containsKey(s2)){
9                if(map.get(s2)==1){
10                    map.put(s2,0);
11                }
12                else{
13                    map.put(s2,-1);
14                }
15            }
16        }
17        int count=0;
18        for(int v:map.values()){
19            if(v==0) count++;
20        }
21        return count;
22        
23    }
24}