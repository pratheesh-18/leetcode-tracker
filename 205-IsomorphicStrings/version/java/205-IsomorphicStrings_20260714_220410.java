// Last updated: 7/14/2026, 10:04:10 PM
1class Solution {
2    public String toLowerCase(String s) {
3        String ans="";
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if (ch >= 'A' && ch <= 'Z') {
7                       ans += (char)(ch + 32);
8            } 
9            else {
10                  ans += ch;
11             }
12
13        }
14        return ans;
15        
16    }
17}