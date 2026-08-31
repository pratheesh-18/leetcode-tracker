// Last updated: 8/31/2026, 10:03:12 AM
1class Solution {
2    public boolean digitCount(String num) {
3        int[] freq=new int[10];
4        for(int i=0;i<num.length();i++){
5            char ch=num.charAt(i);
6            freq[ch-'0']++;
7
8        }
9        for(int i=0;i<num.length();i++){
10            int ch=num.charAt(i)-'0';
11            if(ch!=freq[i]) return false;
12        }
13        return true;
14        
15    }
16}