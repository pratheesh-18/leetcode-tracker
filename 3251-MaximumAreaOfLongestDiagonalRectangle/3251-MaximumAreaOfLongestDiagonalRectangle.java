// Last updated: 7/8/2026, 3:33:28 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        int max=0;
        int maxDia=0;
        for(int i=0;i<dim.length;i++){
            
                 int l1=dim[i][0];
                 int w1=dim[i][1];
                 int currDiag = l1 * l1 + w1 * w1;

            if (currDiag > maxDia || (currDiag == maxDia && l1 * w1 > max)) {
                maxDia = currDiag;
                max = l1 * w1;
            }

            
        }

     

        
        return max;


        
    }
}