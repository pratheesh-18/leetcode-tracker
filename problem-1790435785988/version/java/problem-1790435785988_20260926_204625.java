// Last updated: 9/26/2026, 8:46:25 PM
1class Solution {
2    public boolean canTransform(int[] sou, int[] tar) {
3        long source =0,target=0;
4        for(int s:sou) source+=s;
5        for(int t:tar) target+=t;
6        return source==target;
7        
8    }
9}