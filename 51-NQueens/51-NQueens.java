// Last updated: 7/8/2026, 3:42:58 PM
class Solution {
    static List<List<String>> ans=new ArrayList<>();
      public static void helper(int r, int[][] grid, List<String> board, int n) {

        if (r == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int c = 0; c < n; c++) {

            if (isValid(r, c, grid, n)) {

                grid[r][c] = 1;

                char[] row = new char[n];
                Arrays.fill(row, '.');
                row[c] = 'Q';

                board.add(new String(row));

                helper(r + 1, grid, board, n);

                board.remove(board.size() - 1);
                grid[r][c] = 0;
            }
        }
    }

    public static boolean isValid(int r,int c,int[][] grid,int n){
        for(int i=0;i<r;i++){
            if(grid[i][c]==1) return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(grid[i][j]==1) return false;
        }
        for(int i=r-1,j=c+1; i>=0 && j<n;i--,j++){
            if(grid[i][j]==1) return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        ans.clear();
        
        int[][] grid=new int[n][n];
        helper(0,grid,new ArrayList<>(),n);
        return ans;
        
    }
}