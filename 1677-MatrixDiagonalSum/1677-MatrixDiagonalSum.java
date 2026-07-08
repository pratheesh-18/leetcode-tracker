// Last updated: 7/8/2026, 3:36:43 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
           sum+=mat[i][i];
           sum+=mat[i][mat.length-1-i];
        }
        if(n%2!=0) sum-=mat[n/2][n/2]; 
        return sum;
        
    }
}