// Last updated: 7/18/2026, 8:22:11 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder sb=new StringBuilder();
4        String ygroup="",xgroup="",mid="";
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch==y) ygroup+=ch;
8            else if(ch==x) xgroup+=ch;
9            else mid+=ch;
10            
11        }
12        sb.append(ygroup);
13        sb.append(mid);
14        sb.append(xgroup);
15        return sb.toString();
16        
17    }
18}