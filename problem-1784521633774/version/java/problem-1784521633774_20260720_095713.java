// Last updated: 7/20/2026, 9:57:13 AM
1class Solution {
2    public int maxPower(String s) {
3        int max=0;
4        int count=1;
5        if(s.length()==1) return 1;
6        for(int i=0;i<s.length()-1;i++){
7            if(s.charAt(i)==s.charAt(i+1)){
8                count++;
9            }
10            else{
11                max=Math.max(max,count);
12                count=1;
13            }
14
15        }
16        max = Math.max(max, count); 
17        return max;
18        
19    }
20}