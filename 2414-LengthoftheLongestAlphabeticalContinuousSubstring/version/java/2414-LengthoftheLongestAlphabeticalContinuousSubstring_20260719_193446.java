// Last updated: 7/19/2026, 7:34:46 PM
1class Solution {
2    public int longestContinuousSubstring(String s) {
3        int longestString = 1;
4        int subLen = 1;
5        for(int i = 0; i < s.length() - 1; i++){
6            char char1 = s.charAt(i);
7            char char2 = s.charAt(i+1);
8            if(char1 == char2 - 1){
9                subLen++;
10                longestString = Math.max(longestString, subLen);
11            } else {
12                subLen = 1;
13            }
14        }
15        return longestString;
16
17        
18    }
19}