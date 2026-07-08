// Last updated: 7/8/2026, 3:42:55 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> arr=new ArrayList();
        int rowstart=0,rowend=matrix.length;
        int colstart=0,colend=matrix[0].length;

        while(rowstart<rowend && colstart<colend){
            for(int i=colstart;i<colend;i++){
                arr.add(matrix[rowstart][i]);

            }
            rowstart++;
            for(int i=rowstart;i<rowend;i++){
                arr.add(matrix[i][colend-1]);
            }
            colend--;
            
            if (rowstart < rowend) {
                for (int i = colend - 1; i >= colstart; i--) {
                    arr.add(matrix[rowend - 1][i]);
                }
                rowend--;
            }

            if (colstart < colend) {
                for (int i = rowend - 1; i >= rowstart; i--) {
                    arr.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }
        return arr;
        
    }
}