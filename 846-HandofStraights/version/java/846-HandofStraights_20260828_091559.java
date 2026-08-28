// Last updated: 8/28/2026, 9:15:59 AM
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        if(hand.length%groupSize!=0) return false;
4        Arrays.sort(hand);
5        Map<Integer,Integer> map=new HashMap<>();
6        for(int x:hand){
7            map.put(x,map.getOrDefault(x,0)+1);
8        }
9         for(int x1:hand){
10           if(!map.containsKey(x1)) continue;
11           for(int i=x1;i<x1+groupSize;i++){
12             if(!map.containsKey(i)) return false;
13             map.put(i,map.get(i)-1);
14             if(map.get(i)==0) map.remove(i);
15           }
16        }
17        return true;
18        
19    }
20}