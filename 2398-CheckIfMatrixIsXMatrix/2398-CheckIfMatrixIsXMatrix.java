// Last updated: 7/8/2026, 3:35:22 PM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(grid[i][j]==0) return false;
                }
                else if(i!=j || i+j!=n-1){
                    if(grid[i][j]!=0) return false;
                }
            }
        }
        return true;
        
    }
}