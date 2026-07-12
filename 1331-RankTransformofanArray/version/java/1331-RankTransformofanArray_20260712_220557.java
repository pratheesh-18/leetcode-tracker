// Last updated: 7/12/2026, 10:05:57 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int n=arr.length;
4        int[] sorted=arr.clone();
5        Arrays.sort(sorted);
6        Map<Integer,Integer> map=new HashMap<>();
7        int rank=1;
8       
9        for(int i=0;i<n;i++){
10            if(!map.containsKey(sorted[i])){
11                 map.put(sorted[i],rank++);
12
13            }
14        }
15        for(int i=0;i<n;i++){
16            arr[i]=map.get(arr[i]);
17
18        }
19        return arr;
20        
21    }
22}