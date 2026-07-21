// Last updated: 7/21/2026, 9:07:39 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] str=s.split(" ");
4        StringBuilder sb=new StringBuilder();
5        for(int i=0;i<k;i++){
6            sb.append(str[i]);
7            sb.append(" ");
8        }
9        return sb.toString().trim();
10        
11    }
12}