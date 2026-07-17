// Last updated: 7/17/2026, 9:17:14 AM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3       return (s + s).substring(1, (s + s).length() - 1).contains(s);
4
5        
6    }
7}