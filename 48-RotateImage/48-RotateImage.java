// Last updated: 7/8/2026, 3:43:02 PM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
                
                
            }

        }
        for(int i=0;i<matrix.length;i++){
            int[] row=matrix[i];
            int s=0,l=row.length-1;
            while(s<l ){
                int temp=row[s];
                row[s]=row[l];
                row[l]=temp;
                s++;
                l--;

            }
        }
       
        
        

        
    }
}