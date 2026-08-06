// Last updated: 8/6/2026, 10:23:42 AM
1class Solution {
2    public int countKeyChanges(String s) {
3        String str=s.toLowerCase();
4        int count=0;
5        for(int i=0;i<str.length()-1;i++){
6            if(str.charAt(i)!=str.charAt(i+1)) count++;
7
8        }
9        return count;
10        
11    }
12}