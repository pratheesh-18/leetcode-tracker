// Last updated: 7/18/2026, 10:25:23 AM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        int s1=0,l=s.length()-1;
4       char[] ch=s.toCharArray();
5        while(s1<l){
6            if(Character.isLetter(ch[s1]) && Character.isLetter(ch[l]) ){
7                char t=ch[s1];
8                ch[s1]=ch[l];
9                ch[l]=t;
10                s1++;
11                l--;
12            }
13           else if(Character.isLetter(ch[s1]) && !Character.isLetter(ch[l]) ){
14               
15                l--;
16            }
17            else if(!Character.isLetter(ch[s1]) && Character.isLetter(ch[l]) ){
18                s1++;
19
20            }
21            else{
22                s1++;
23                l--;
24            }
25            
26            
27
28        }
29        return new String(ch);
30    }
31}