// Last updated: 7/20/2026, 10:11:02 AM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] cha=new char[s.length()];
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6           cha[indices[i]]=ch;
7        }
8        
9        return new String(cha);
10        
11    }
12}