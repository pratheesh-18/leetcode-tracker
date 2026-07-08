// Last updated: 7/8/2026, 3:42:01 PM
import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0 ||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prev=pascal.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }

            }
            pascal.add(row);
        }
        // List<Integer> ind=pascal.get(rowIndex);
        return pascal.get(rowIndex);
        
    }
}