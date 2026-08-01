// Last updated: 8/1/2026, 8:22:40 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int zero=0;
4        int one=0,ans=0;
5        for(char c:s.toCharArray()){
6            if(c=='0') zero++;
7            if(c=='1') one++;
8            if(Math.abs(zero-one)<=1) ans++;
9        }
10        return ans;
11        
12        
13    }
14}