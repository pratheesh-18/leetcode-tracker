// Last updated: 7/8/2026, 3:39:51 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
        
    }
}