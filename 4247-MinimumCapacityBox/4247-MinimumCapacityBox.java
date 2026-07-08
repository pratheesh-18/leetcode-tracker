// Last updated: 7/8/2026, 3:31:57 PM
class Solution {
    public int minimumIndex(int[] cap, int item) {
        int ind=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<cap.length;i++){
            if(cap[i]>=item){
                 if(cap[i]<min){
                     min=cap[i];
                     ind=i;
                 }
                
            }
            
        }
        return ind;
        
    }
}