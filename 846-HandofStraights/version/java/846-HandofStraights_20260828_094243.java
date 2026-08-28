// Last updated: 8/28/2026, 9:42:43 AM
1class Solution {
2    public int numSplits(String s) {
3        int n =s.length();
4        Set<Character> set=new HashSet<>();
5        Map<Character,Integer> map=new HashMap<>();
6        int count=0;
7        for(int i=0;i<n;i++){
8            char ch=s.charAt(i);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10        }
11        for(int i=0;i<n;i++){
12            char ch=s.charAt(i);
13            set.add(ch);
14            if(map.containsKey(ch)){
15                map.put(ch,map.get(ch)-1);
16                if(map.get(ch)==0) map.remove(ch);
17            }
18            if(map.size()==set.size()) count++;
19        }
20        return count;
21    }
22}