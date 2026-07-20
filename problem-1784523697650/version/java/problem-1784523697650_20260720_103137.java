// Last updated: 7/20/2026, 10:31:37 AM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int max=-1;
4        for(int i=0;i<s.length();i++){
5            for(int j=i+1;j<s.length();j++){
6                if(s.charAt(i)==s.charAt(j)){
7               max=Math.max(max,j-i-1);
8                }
9            
10                
11            }
12            
13        }
14        return max;
15        
16    }
17}