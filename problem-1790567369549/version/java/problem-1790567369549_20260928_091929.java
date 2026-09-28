// Last updated: 9/28/2026, 9:19:29 AM
1class Solution {
2    public int maxDepth(String s) {
3        int depth=0,max=0;
4        for(char c: s.toCharArray()){
5            if(c=='('){
6                depth++;
7                if(depth>max) max=depth;
8            }
9            
10            else if(c==')') depth--;
11        }
12        return max;
13        
14    }
15}