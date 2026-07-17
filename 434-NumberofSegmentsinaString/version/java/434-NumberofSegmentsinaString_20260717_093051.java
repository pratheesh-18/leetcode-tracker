// Last updated: 7/17/2026, 9:30:51 AM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int c=0;
4        int n=word.length();
5        for(int i=0;i<n;i++){
6            char ch=word.charAt(i);
7            if(ch>='A' && ch<='Z'){
8                c++;
9            }
10            
11        }
12        if(c==n  || c==0) return true;
13        else if(c==1 && word.charAt(0)>='A' && word.charAt(0)<='Z') return true;
14        return false;
15        
16    }
17}