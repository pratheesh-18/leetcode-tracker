// Last updated: 9/1/2026, 10:12:23 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int[] ans=new int[matrix.length];
4        int ind=0;
5        for(int[] mat:matrix){
6            int count=0;
7            for(int v:mat){
8                if(v==1) count++;
9            }
10            ans[ind++]=count;
11        }
12        return ans;
13        
14    }
15}