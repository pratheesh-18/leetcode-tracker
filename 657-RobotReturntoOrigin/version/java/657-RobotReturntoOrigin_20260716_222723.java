// Last updated: 7/16/2026, 10:27:23 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int up=0,d=0,r=0,l=0;
4        for(int i=0;i<moves.length();i++){
5            char ch=moves.charAt(i);
6            if(ch=='U') up++;
7            else if(ch=='D') d++;
8            else if(ch=='L') l++;
9            else if(ch=='R') r++;
10            else return false;
11        }
12        return (up==d && l==r);
13        
14    }
15}