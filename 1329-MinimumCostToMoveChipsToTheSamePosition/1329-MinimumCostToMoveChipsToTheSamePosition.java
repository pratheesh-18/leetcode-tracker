// Last updated: 7/8/2026, 3:37:40 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int pos:position){
            if(pos%2==0) even++;
            else odd++;
           

        }
        if(odd>even) return even;
        return odd;
        
    }
}