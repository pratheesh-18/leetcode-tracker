// Last updated: 7/18/2026, 10:53:07 AM
1class Solution {
2    public int minSteps(String s, String t) {
3        int n=s.length();
4        int[] freq=new int[26];
5       
6        
7        
8        for(int i=0;i<n;i++){
9            freq[s.charAt(i)-'a']++;
10
11        }
12         for(int i=0;i<n;i++){
13            freq[t.charAt(i)-'a']--;
14
15        }
16        int count=0;
17        for(int num:freq){
18            if(num>0) count+=num;
19        }
20        return count;
21
22        
23    }
24}