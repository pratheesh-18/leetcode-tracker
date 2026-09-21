// Last updated: 9/21/2026, 9:50:03 AM
1class Solution {
2    public String frequencySort(String s) {
3        char[] arr=s.toCharArray();
4        
5        Map<Character ,Integer> map=new HashMap<>();
6        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
7        for(char c:arr){
8            map.put(c,map.getOrDefault(c,0)+1);
9
10        }
11        pq.addAll(map.entrySet());
12        StringBuilder sb=new StringBuilder();
13        while(!pq.isEmpty()){
14            Map.Entry<Character,Integer> entry=pq.poll();
15            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
16
17        }
18        return sb.toString();
19
20        
21        
22    }
23}